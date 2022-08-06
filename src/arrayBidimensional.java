import javax.swing.*;

public class arrayBidimensional {
    public static void main(String[] args) {
        String nombre;
        String direccion;
        String telefono;
        int posicionGuardar;
        int posicionConsultar;
        int sobreescribir;
        int eliminar;


        String[][] libreta = new String[5][3];
        boolean continuar = true;
        while (continuar) {
            String menu = JOptionPane.showInputDialog("1. guardar contacto \n" +
                    "2. consultar contaco \n" +
                    "3. borrar contacto \n" +
                    "4. salir");
            switch (menu) {
                case "1":
                    posicionGuardar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posicion a guardar"));
                    if (libreta[posicionGuardar][0]==null){

                        nombre = JOptionPane.showInputDialog("ingrese el nombre");
                        telefono = JOptionPane.showInputDialog("ingrese el telefono");
                        direccion = JOptionPane.showInputDialog("ingrese la direccion");


                        libreta[posicionGuardar][0] = nombre;
                        libreta[posicionGuardar][1] = telefono;
                        libreta[posicionGuardar][2] = direccion;

                    }else{
                        sobreescribir=Integer.parseInt(JOptionPane.showInputDialog("YA EXISTE UN CONTACTO EN ESA POSICION, DESEA SOBREESCRIBIR?   SI= 1  NO=0 "));
                        if(sobreescribir==1){

                            nombre = JOptionPane.showInputDialog("ingrese el nombre");
                            telefono = JOptionPane.showInputDialog("ingrese el telefono");
                            direccion = JOptionPane.showInputDialog("ingrese la direccion");


                            libreta[posicionGuardar][0] = nombre;
                            libreta[posicionGuardar][1] = telefono;
                            libreta[posicionGuardar][2] = direccion;

                        }else{
                            JOptionPane.showMessageDialog(null,"No se realizo ninguna operación");

                        }

                    }

                    break;

                case "2":
                    posicionConsultar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posicion a consultar"));
                    if (libreta[posicionConsultar][0]==null){
                        JOptionPane.showMessageDialog(null,"No se ha encontrado ningun contacto guardado");
                    }else{
                        JOptionPane.showMessageDialog(null,"Nombre "+libreta[posicionConsultar][0]+
                                "\nTelefono: "+libreta[posicionConsultar][1]+
                                "\nDireccion: "+libreta[posicionConsultar][2]);
                    }

                    break;
                case "3":
                    posicionConsultar= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a borrar"));
                    if (libreta[posicionConsultar][0]==null){
                        JOptionPane.showMessageDialog(null,"No hay informacion para borrar");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nombre " + libreta[posicionConsultar][0] +
                                "\nTelefono: " + libreta[posicionConsultar][1] +
                                "\nDireccion: " + libreta[posicionConsultar][2]);
                        //eliminar=Integer.parseInt(JOptionPane.showInputDialog("Desea Eliminar?"));

                        eliminar = JOptionPane.YES_NO_OPTION;
                        JOptionPane.showConfirmDialog(null, "Desea eliminar este contacto?");

                        if (eliminar == JOptionPane.YES_OPTION) {
                            libreta[posicionConsultar][0] = null;
                            libreta[posicionConsultar][1] = null;
                            libreta[posicionConsultar][2] = null;


                            JOptionPane.showMessageDialog(null, "Informacion eliminada correctamente.!");
                        }
                    }

                    break;
                case "4":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "por favor lea bien e ingrese una opcion valida");

            }
        }
    }
}
