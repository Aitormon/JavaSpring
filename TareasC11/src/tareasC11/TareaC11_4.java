package tareasC11;

import javax.swing.JOptionPane;

import java.util.ArrayList;


public class TareaC11_4
{
   // public static void main(String[] args)
   // {
	public void Tarea_C11_4() {
    	ArrayList<String> persons = new ArrayList<String>();
		
        String employee[] = {"Alex", "Thomas", "Bob", "Yohan"};
        
		
        for (int i = 0; i < employee.length ; i++)
        {
            persons.add(i,employee[i]);
 
            System.out.println(persons.get(i));
        }
		
        
        
       
    }
}
