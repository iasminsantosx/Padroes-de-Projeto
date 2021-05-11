import java.util.List;
import java.util.ArrayList;

/** "Component" **/
interface Graphic {

    //Printa o grafico.
    public void print();
    public double area();
    public double perimetro();
}

/** "Composite" **/

class CompositeGraphic implements Graphic {

    //Coleção de Graficos  filhos
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    //Printa o grafico
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    public double area() {
        double area_todo = 0;
        for (Graphic graphic : childGraphics) {
            area_todo += graphic.area();
        }
        return(area_todo);
    }

    public double perimetro() {
        double perimetro_todo =0;
        for (Graphic graphic : childGraphics){
            perimetro_todo += graphic.perimetro();
        }
            return (perimetro_todo);
    }


    //Adiciona o grafico a composição.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
    //Remove a forma geometrica da composição.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }

}

/** "Leaf" **/
class Ellipse implements Graphic {

    //Printa o grafico.
    public void print() {
        System.out.println("Ellipse");
    }
    public double area() {
        return(2);
    }
    public double perimetro() {
        return (12.2);
    }
}

/** "Leaf" **/
class Circle implements Graphic {

    //Printa o grafico.
    public void print() {
        System.out.println("Circle");
    }
    public double area() {
        return(3.1415);
    }
    public double perimetro() {
        return (6.14);
    }
}

class Square  implements Graphic{
    public void print() {
        System.out.println("Square");
    }

    public double area() {
        return(4);
    }

    public double perimetro() {
        return (8);
    }
}

class Rectangle implements Graphic{
    public void print() {
        System.out.println("Rectangle");

    }

    public double area() {
        return (10);
    }

    public double perimetro() {
        return (20);
    }
}

/** Client **/
public class ClienteComposite {

    public static void main(String[] args) {
        //Inicializa quatro elipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Inicializa tres componentes do grafico.
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Faz o grafico
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        System.out.println("Graphic1 Area: " + graphic1.area());
        System.out.println("Graphic1 Perimetro: "+graphic1.perimetro());

        graphic2.add(ellipse4);

        System.out.println("Graphic2 Area: " + graphic2.area());
        System.out.println("Graphic2 Perimetro: "+graphic2.perimetro());

        graphic.add(graphic1);
        graphic.add(graphic2);
        graphic.add(new Circle());
        // Printa quatro vezes a String Ellipse ( Ele printa o grafico completo).
        graphic.print();

        System.out.println("Graphic Area: " + graphic.area());
        System.out.println("Graphic Perimetro: "+graphic.perimetro());

        //Graphic 3
        CompositeGraphic graphic3 = new CompositeGraphic();
        graphic3.add(new Ellipse());
        graphic3.add(new Circle());
        graphic3.add(new Square());
        graphic3.add(new Rectangle());

        graphic3.print();
        System.out.println("Graphic3 Area: "+graphic3.area());
        System.out.println("Graphic3 Perimetro: "+graphic3.perimetro());

    }
}
