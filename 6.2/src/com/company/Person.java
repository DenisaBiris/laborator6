package com.company;
import java.io.*;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

   public class Person {
   public String firstName;
   public String lastName;
   public String group;
   public int n;

    Scanner scan = new Scanner(System.in);
    Person p[] = new Person[10];
    Person c[] = new Person[10];
   public void getPerson() throws FileNotFoundException {
       File filein = new File("an.txt");
       Scanner scanner = new Scanner(filein);
       System.out.println("\n\nMai intai, verificati fisierul <<an.txt>>...\n\n");
      System.out.println("Cate persoane luati in considerare?(2-10)\n");
      n = scan.nextInt();
       for(int i=0;i<n;i++)

       {   p[i] = new Person();
           ((Person)p[i]).firstName= scanner.next();
           ((Person)p[i]).lastName=scanner.next();
           ((Person)p[i]).group=scanner.next();

       }
   }

   public void viewPerson() throws IOException{
       FileWriter writer = new FileWriter("an.txt");
       for(int i =0;i<n;i++){
           writer.write(((Person)p[i]).firstName+" "+((Person)p[i]).lastName+" "+((Person)p[i]).group+"\n");
       }
       writer.close();

   }
      public  void merge( int low, int high, int mid)
       {
           int i, j, k;
           Person c[] = new Person[10];
           i = low;
           k = low;
           j = mid + 1;
           while (i <= mid && j <= high) {
               if (((Person)p[i]).firstName.compareTo(((Person)p[j]).firstName)<0)  {
                   c[k] = p[i];
                   k++;
                   i++;
               }
               else  {
                   c[k] = p[j];
                   k++;
                   j++;
               }
           }
           while (i <= mid) {
               c[k] = p[i];
               k++;
               i++;
           }
           while (j <= high) {
               c[k] = p[j];
               k++;
               j++;
           }
           for (i = low; i < k; i++)  {
               p[i] = c[i];
           }
       }

       public void merge_sort(int low, int high)
       {
           int mid;
           if (low < high){
               mid=(low+high)/2;
               merge_sort(low,mid);
               merge_sort(mid+1,high);
               merge(low,high,mid);
           }
       }

       public void sortare(){
       merge_sort(0,n-1);
       }

public void viewSortedPerson() throws IOException{
    FileWriter writerSort= new FileWriter("an_sort.txt");
    for(int i =0;i<n;i++){
        writerSort.write(((Person)p[i]).firstName+" "+((Person)p[i]).lastName+" "+((Person)p[i]).group+"\n");
    }
    writerSort.close();

}
}
