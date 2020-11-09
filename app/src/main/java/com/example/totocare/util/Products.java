package com.example.totocare.util;

import java.math.BigDecimal;
import java.util.HashMap;

import com.example.totocare.R;
import com.example.totocare.models.Product;

public class Products {

    public Product[] PRODUCTS = {RED_LAMP, YELLOW_LAMP, BLUE_MUG, WHITE_MUG, RED_MUG, BLACK_HAT, BLUE_HAT, WHITE_HAT, ORANGE_HAT,
        GREY_FIDGET_SPINNER, GREEN_FIDGET_SPINNER};


    public HashMap<String, Product> PRODUCT_MAP = new HashMap<>();

    public Products() {
        for(Product product : PRODUCTS){
            PRODUCT_MAP.put(String.valueOf(product.getSerial_number()), product);
        }

    }

    public static final Product RED_LAMP = new Product("Red Lamp", "Red colored lamp, perfect for lighting up a room " +
            "and matching any red furniture.", R.drawable.red_lamp, new BigDecimal(10.99), new BigDecimal(9.50), 161,
            new BigDecimal(4.5), 1515611);

    public static final Product YELLOW_LAMP = new Product("Yellow Lamp", "Yellow colored lamp, perfect for lighting up a room " +
            "and matching any Yellow furniture.", R.drawable.yellow_lamp, new BigDecimal(11.99), new BigDecimal(0), 6,
            new BigDecimal(5), 7725277);

    public static final Product BLUE_MUG = new Product("Blue Coffee Mug", "Blue Coffee Mug for drinking coffee. 100% ceramic.",
            R.drawable.blue_mug, new BigDecimal(5.99), new BigDecimal(0), 66, new BigDecimal(3.5), 2141515);

    public static final Product WHITE_MUG = new Product("White Coffee Mug", "White Coffee Mug for drinking coffee. 100% ceramic.",
            R.drawable.white_mug, new BigDecimal(6.99), new BigDecimal(0), 7, new BigDecimal(4), 9704833);

    public static final Product RED_MUG = new Product("Red Coffee Mug Red", "Red Coffee Mug for drinking coffee. 100% ceramic.",
            R.drawable.red_mug, new BigDecimal(8.99), new BigDecimal(0), 157, new BigDecimal(4.5), 9377376);

    public static final Product BLACK_HAT = new Product("Black Baseball Hat", "Black Baseball Hat made of 100% authentic " +
            "baseball hat material.",
            R.drawable.black_hat, new BigDecimal(20.99), new BigDecimal(0), 121, new BigDecimal(3.5), 6626622);

    public static final Product BLUE_HAT = new Product("Blue Baseball Hat", "Blue Baseball Hat made of 100% authentic " +
            "baseball hat material.",
            R.drawable.blue_hat, new BigDecimal(22.99), new BigDecimal(0), 67, new BigDecimal(4.5), 7837367);

    public static final Product WHITE_HAT = new Product("White Baseball Hat", "White Baseball Hat made of 100% authentic " +
            "baseball hat material.",
            R.drawable.white_hat, new BigDecimal(18.99), new BigDecimal(15.99), 88, new BigDecimal(2.5), 7695085);

    public static final Product ORANGE_HAT = new Product("Orange Baseball Hat", "Orange Baseball Hat made of 100% authentic " +
            "baseball hat material.",
            R.drawable.orange_hat, new BigDecimal(23.99), new BigDecimal(0), 23, new BigDecimal(4), 9084728);

    public static final Product GREY_FIDGET_SPINNER = new Product("Grey Fidget Spinner", "Grey Fidget Spinner. High quality" +
            " bearing for long spin time. Light and portable.", R.drawable.fidget_spinner_grey, new BigDecimal(100), new BigDecimal(59.99)
            , 37, new BigDecimal(4.5), 8830303);

    public static final Product GREEN_FIDGET_SPINNER = new Product("Green Fidget Spinner", "Green Fidget Spinner. High quality" +
            " bearing for long spin time. Light and portable.", R.drawable.fidget_spinner_green, new BigDecimal(100), new BigDecimal(0)
            , 3, new BigDecimal(4), 9082727);

}
