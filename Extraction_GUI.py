# -*- coding: utf-8 -*-
"""
Created on Tue Aug 24 09:25:29 2021

@author: f2rr7vs
"""

from tkinter import *
from tkinter import filedialog
from tkinter import messagebox
#from ExtractionScript import webParagonExport 
import xml.etree.ElementTree as ET
import csv


win = Tk()

class ExtractGUI(object):
    
    transaction_list = []
    transaction_guid = {}
    
    def __init__(self, win):

        win.title("TxnName_GUID_Seperator")
        win.geometry('500x200')
        win.config(background="lightblue")
        win.resizable(0,0)
        win.eval('tk::PlaceWindow . center')

        self.Xmlfilelabel = Label(win, text="XML File Location:  ",font=('Arial', 9, 'bold'))
        self.Xmlfilelabel.place(x=2, y=10)
        self.messagebox = Entry(win,bd=1, bg='light grey',font=('arial', 6),\
                                 highlightbackground = 'red',highlightthickness = 1,highlightcolor='red')
        self.messagebox.place(x=170, y=10, height=22, width=180)
        #self.messagebox.focus()

        self.outputlabel = Label(win, text="Output CSV Location:  ",font=('Arial', 9, 'bold'))
        self.outputlabel.place(x=2, y=40)
        self.messagebox1 = Entry(win,bd=1, bg='light grey',font=('arial', 6),\
                                 highlightbackground = 'red',highlightthickness = 1,highlightcolor='red')
        self.messagebox1.place(x=170, y=40, height=22, width=180)
        #self.messagebox.focus()
        
        

        self.BrowseBtn1 = Button(win,text = 'Browse', bd=1, bg='Antiquewhite1', activebackground = 'white', \
                                 font=('arial', 6, 'bold'), foreground = 'black',relief = 'raised', \
                                     highlightbackground = 'red',highlightthickness = 1,\
                                     command = lambda: self.browseXMLFiles())
        self.BrowseBtn1.place(x=360, y=10, height=20, width= 40)

        self.BrowseBtn2 = Button(win,text = 'Browse', bd=1, bg='Antiquewhite1', activebackground = 'white', \
                                 font=('arial', 6, 'bold'), foreground = 'black',relief = 'raised', \
                                     highlightbackground = 'red',highlightthickness = 1,\
                                     command = lambda: self.browseCSVFiles())
        self.BrowseBtn2.place(x=360, y=40, height=20, width= 40)

        self.ExtractBtn = Button(win,text = 'Extract', bd=1, bg='tomato', activebackground = 'white', \
                                 font=('arial', 9, 'bold'), foreground = 'black',relief = 'raised', \
                                     highlightbackground = 'red',highlightthickness = 1,\
                                         command = lambda: self.wholeFunc() )
        self.ExtractBtn.place(x=180, y=100, height=40, width= 60)
        
        self.exitBtn = Button(win,text = 'Exit', bd=1, bg='salmon', activebackground = 'white', \
                                 font=('arial', 9, 'bold'), foreground = 'black',relief = 'raised', \
                                     highlightbackground = 'red',highlightthickness = 1,\
                                         command = lambda: self.quitSession() )
        self.exitBtn.place(x=250, y=100, height=40, width= 60)
       
        
        
    def browseXMLFiles(self):
        
        self.xmlFilelocation = filedialog.askopenfilename(initialdir = "/",
                                          title = "Select a File",
                                          filetypes = (("XML file",
                                                        "*.xml*"),\
                                                       ))
        #print(self.xmlFilelocation)
        self.messagebox.insert(END, self.xmlFilelocation)
        
        return self.xmlFilelocation
    
    def browseCSVFiles(self):
        
        self.outputLocation = filedialog.askopenfilename(initialdir = "/",
                                          title = "Select a File",
                                          filetypes = (("CSV file",
                                                        "*.csv*"),\
                                                       ))
        self.messagebox1.insert(END, self.outputLocation)
        
        return self.outputLocation
    
    def getTranandguid(self):
        
        self.errorInput()
    
        tree = ET.parse(self.xmlFilelocation)
        root = tree.getroot()
        #print(root.tag)

        for transaction in root.iter('transaction'):
        
        #transaction_guid['TxnName'] =transaction.attrib['description']
              self.transaction_guid[transaction.attrib['description']] =transaction.attrib['guid']
        return self.transaction_guid
    

    def savetoCSV(self):
    
  
    # specifying the fields for csv file
        fields = ['TransactionName', 'guid']
  
    # writing to csv file
        with open(self.outputLocation, 'w', newline = '') as csvfile:
  
        # creating a csv dict writer object
            writer = csv.writer(csvfile)
  
        # writing headers (field names)
            writer.writerow(fields)
  
        # writing data rows
            for key, value in self.transaction_guid.items():
                temp = [key,value]
                self.transaction_list.append(temp)
            
            writer.writerows(self.transaction_list)
       
        messagebox.showinfo("showinfo", "Completed!!. Please check your output location")
    
        self.cleanUp()
    def errorInput(self):
        
        self.xml_input = self.messagebox.get()
        self.csv_input = self.messagebox1.get()
        #print(self.user_input)
        #self.DisplayData()
        #self.messagebox.delete(1.0,END)
        if self.xml_input == '' :
            messagebox.showinfo("showinfo", "XML file location cannot be empty")
        elif self.csv_input == '':
            messagebox.showinfo("showinfo", "CSV file location cannot be empty")
        
    def cleanUp(self):
        self.messagebox.delete(0, END)
        self.messagebox1.delete(0, END)
        
        
    
    
        
    def quitSession(self):    
         
        user_input = messagebox.askquestion("MessageBox", "Do you really want to Quit?")
        if user_input == 'yes':
            win.destroy()
        else:
            pass
    
        
    def wholeFunc(self, event=None):
        self.getTranandguid()
        self.savetoCSV()
        

        

             
GUI = ExtractGUI(win)
   

win.mainloop()