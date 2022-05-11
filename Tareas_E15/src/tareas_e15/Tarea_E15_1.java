package tareas_e15;

import javax.swing.JOptionPane;

public class Tarea_E15_1 {
	public Byte nomdia;
	
	
	public enum dias{
		LUNES,
		MARTES,
		MIERCOLES,
		JUEVES,
		VIERNES,
		SABADO,
		DOMINGO

	}

	public void TareaE15_1() {

		int numero = Byte.parseByte(JOptionPane.showInputDialog("Ingresa el numero de dia de la semana"));
        String nomdia;
		switch(numero){
            case 1: JOptionPane.showMessageDialog(null,"Hoy es "+ dias.LUNES);
            break;
            case 2: JOptionPane.showMessageDialog(null,"Hoy es "+ dias.MARTES);
            break;
            case 3: JOptionPane.showMessageDialog(null,"Hoy es "+ dias.MIERCOLES);
            break;
            case 4: JOptionPane.showMessageDialog(null,"Hoy es "+ dias.JUEVES);
            break;
            case 5: JOptionPane.showMessageDialog(null,"Hoy es "+ dias.VIERNES);
            break;
            case 6: JOptionPane.showMessageDialog(null,"Hoy es "+ dias.SABADO);
            break;
            case 7: JOptionPane.showMessageDialog(null,"Hoy es "+ dias.DOMINGO);
            break;
        }
		
		if(numero < 7) {
			numero++;
		}else {
		numero = 1;
		}
		
          switch(numero){
          case 1: JOptionPane.showMessageDialog(null,"Mañana será "+ dias.LUNES);
          break;
          case 2: JOptionPane.showMessageDialog(null,"Mañana será "+ dias.MARTES);
          break;
          case 3: JOptionPane.showMessageDialog(null,"Mañana será "+ dias.MIERCOLES);
          break;
          case 4: JOptionPane.showMessageDialog(null,"Mañana será "+ dias.JUEVES);
          break;
          case 5: JOptionPane.showMessageDialog(null,"Mañana será "+ dias.VIERNES);
          break;
          case 6: JOptionPane.showMessageDialog(null,"Mañana será "+ dias.SABADO);
          break;
          case 7: JOptionPane.showMessageDialog(null,"Mañana será "+ dias.DOMINGO);
          break;
      }

          
    }

	
	
}
