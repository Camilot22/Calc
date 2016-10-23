package derivada;

public class Controlador {
    
    public void Derivadas(){
        
        Calculo cal = new Calculo();
        view vi = new view();
        vi.imprimir("1-) para X ");
        vi.imprimir("2-) para X al cuadrado");
        vi.imprimir("3-) para X al cubo");
        vi.imprimir("4-) para X al cuadrado + 1");
        vi.imprimir("5-) para X al cubo + 3X");
        vi.imprimir("6-) para raiz cuadrada de X");
        vi.imprimir("7-) para raiz cubica de X ");
        vi.imprimir("8-) para X/2");
        vi.imprimir("9-) para X/5 + 2X");
        vi.imprimir("10-) para X elevado a la 3/2 menos 1");
        vi.imprimir("Ingrese la funcion deseada");
        
        double n = vi.Pedir();
            if (n == 1) {
                
                vi.imprimir("ingrese el x que desea calcular");
                double x= vi.Pedir();  
                vi.imprimirdo(cal.Derivar(x,n)); 
        }
            if (n == 2) {
                
                vi.imprimir("ingrese el x que desea calcular");
                double x= vi.Pedir();  
                vi.imprimirdo(cal.Derivar(x,n)); 
        }
            if (n == 3) {
            
                vi.imprimir("ingrese el x que desea calcular");
                double x= vi.Pedir();  
                vi.imprimirdo(cal.Derivar(x,n));
        }
            if (n == 4) {
                
                vi.imprimir("ingrese el x que desea calcular");
                double x= vi.Pedir();  
                vi.imprimirdo(cal.Derivar(x,n)); 
        }
            if (n == 5) {
                
                vi.imprimir("ingrese el x que desea calcular");
                double x= vi.Pedir();  
                vi.imprimirdo(cal.Derivar(x,n)); 
        }
            if (n == 6) {
                
                vi.imprimir("ingrese el x que desea calcular");
                double x= vi.Pedir();  
                vi.imprimirdo(cal.Derivar(x,n)); 
        }
            if (n == 7) {
                
                vi.imprimir("ingrese el x que desea calcular");
                double x= vi.Pedir();  
                vi.imprimirdo(cal.Derivar(x,n)); 
        }
            if (n == 8) {
                
                vi.imprimir("ingrese el x que desea calcular");
                double x= vi.Pedir();  
                vi.imprimirdo(cal.Derivar(x,n)); 
        }
            if (n == 9) {
                
                vi.imprimir("ingrese el x que desea calcular");
                double x= vi.Pedir();  
                vi.imprimirdo(cal.Derivar(x,n)); 
        }
            if (n == 10) {
                
                vi.imprimir("ingrese el x que desea calcular");
                double x= vi.Pedir();  
                vi.imprimirdo(cal.Derivar(x,n)); 
        }
        
        


        

        
    }
    
    
    
}
