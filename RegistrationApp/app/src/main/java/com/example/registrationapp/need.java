package com.example.registrationapp;

import android.content.Context;
import android.view.View;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class need {
    public static final String Filename="List.data";

    public static void  writeData(ArrayList<String>item, View.OnClickListener context){
        try {
            FileOutputStream fos = context.openFileOutput(Filename,Context.MODE_PRIVATE);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(item);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
      public static ArrayList<String> readData(Context context){
        ArrayList<String>listv=null;
          try {
              FileInputStream fis=context.openFileInput(Filename);
              ObjectInputStream ois=new ObjectInputStream(fis);
              listv=new ArrayList<>();
          } catch (FileNotFoundException e) {
              listv=new ArrayList<>();
              e.printStackTrace();
          } catch (IOException e) {
              e.printStackTrace();
          }
          return listv;

      }

    }

