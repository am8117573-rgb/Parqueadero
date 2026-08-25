import java.util.Scanner;
import javax.sound.midi.SysexMessage;

    public ObjVehiculo [][] LlenarCeldas(ObjVehiculo [][] m)
    {
        for (int i = 0; i < m.length; i++) { //filas
            for (int j = 0; j < m.length; j++) { //columnas
                ObjVehiculo o = new ObjVehiculo();
                System.out.println("Ingrese el vehiculo");
                o.setVehiculo(sc.next());
                System.out.println("ingrese el propietario");
                o.setPropietario(sc.next());
                System.out.println("ingrese el tipo de vehiculo");
                o.setTipo(sc.next());
                System.out.println("ingrese el tipo de plan");
                o.setPlan(sc.next());
                 System.out.println("ingrese el valor del plan");
                o.setValorPlan(sc.nextInt());

                if (o.getPlan().equalsIgnoreCase("mensual")) {
                    o.setDescuento(10);
                }
                else if (o.getPlan().equalsIgnoreCase("quincenal")) {
                    o.setDescuento(5);
                }
                else if (o.getPlan().equalsIgnoreCase("trimestral")) {
                    o.setDescuento(15);
                }
                else {
                    o.setDescuento(0);
                }

                System.out.println("ingrese el total a pagar");
                o.setTotalPagar(sc.nextInt());
                m[i][j] = o;
            }
        }
        return m;
    }
      public ObjVehiculo [][] CalcularNuevoPago(ObjVehiculo [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j].setValorPlan(m[i][j].getValorPlan());

                
            }
            
        }
        return  m;
      }
      public void MostrarTotalPagar(ObjVehiculo[][] m) 
      {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Vehiculo: "+ m[i][j].getVehiculo());
                System.out.println("Propietario: "+ m[i][j].getPropietario());
                System.out.println("Tipo: "+ m[i][j].getTipo());
                System.out.println("Plan: "+ m[i][j].getPlan());
                System.out.println("ValorPlan: "+ m[i][j].getValorPlan());
                System.out.println("Descuiento: "+ m[i][j].getDescuento());
                System.out.println("TotalPagar: "+ m[i][j].getTotalPagar());
                System.out.println("----------------------------------");




            }
            
        }
      }

