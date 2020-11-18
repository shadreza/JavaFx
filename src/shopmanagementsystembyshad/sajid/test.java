/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanagementsystembyshad.sajid;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static shopmanagementsystembyshad.sajid.InfoOfProducts.bprice;
import static shopmanagementsystembyshad.sajid.InfoOfProducts.id;
import static shopmanagementsystembyshad.sajid.InfoOfProducts.name;
import static shopmanagementsystembyshad.sajid.InfoOfProducts.qty;
import static shopmanagementsystembyshad.sajid.InfoOfProducts.sprice;
import static shopmanagementsystembyshad.sajid.WelcomePage.NumberOfProducts;


/**
 *
 * @author ASUS
 */
public class test {
    

            public void Emni(String Path){
                ReadFile r = new ReadFile();
                int n = r.ReadProducts(Path);
                System.out.println(n);
                String name = "kitkat";
                int qty = 100;
                float bprice = (float) 18.0;
                float sprice = (float) 25.0;
                int id ;
                if(n>0){
                    int[] ids = r.GetProductIds();
                    id = ids[n-1]+1;
                }
                else{
                    id=0;
                    qty=0;
                    sprice=0;
                    bprice=0;
                    name="None";
                }
                System.out.println(id);
                append a = new append();
               
                boolean b = a.AppendToFile(Path, id,name, bprice, sprice,qty);
                System.out.println("----------------");
                ReadFile rr = new ReadFile();
                n=rr.ReadProducts(Path);
                String[] ids = rr.GetProductNames();
                for(int i=1;i<n;i++){
                    System.out.println(ids[i]);
                }
                //n = r.ReadProducts(Path);
            }
            public static void main(String[] args) {
                test t= new test();
                for(int i=0;i<1;i++){
                t.Emni("D:\\programming\\java\\224_Project\\ShopManagementSystemByShad&Sajid\\ProductsInformation.csv");}
    }

}
