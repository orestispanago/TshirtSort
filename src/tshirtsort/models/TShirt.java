/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort.models;

import java.util.Objects;

/**
 *
 * @author mac
 */

/*
       .5     .10      .15     .20   .25    .30     .35
Color, {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}

       .22 .23 .25 .30 .35 .45   .60  
Size, {XS, S,   M, L,  XL, XXL, XXXL}
          
          2.5    4.5      5         7.5   8.2      9.3     22
Fabric, {WOOL, COTTON, POLYESTER, RAYON, LINEN, CASHMERE, SILK}

*/

public class TShirt {
    private float basePrice = 10;
    private String name;
    private Color color;
    private Size size;
    private Fabric fabric;
    private float price;

    public TShirt() {
    }
       
    public TShirt(String name, Color color, Size size, Fabric fabric, float price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
        setPrice(price); // this.price = price; this is wrong!!!
    }

    public float getPrice() {
        return price;
    }

    // base price = 10
    // setPrice(22.75)
    // price 10+22.75 = 32.75 
    public void setPrice(float price) {
        this.price = this.basePrice + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.color);
        hash = 53 * hash + Objects.hashCode(this.size);
        hash = 53 * hash + Objects.hashCode(this.fabric);
        hash = 53 * hash + Float.floatToIntBits(this.price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TShirt other = (TShirt) obj;
        if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (this.fabric != other.fabric) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TShirt{" + "name=" + name + ", color=" + color + ", size=" + size + ", fabric=" + fabric + ", price=" + price + '}';
    }
}
