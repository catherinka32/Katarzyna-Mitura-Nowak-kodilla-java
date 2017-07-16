package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mitura on 2017-07-15.
 */
public class ShapeCollector {
    private List<Figure> figures;

    public ShapeCollector(){
        figures = new ArrayList<Figure>();
    }

    public void addFigure(Figure figure){
        figures.add(figure);

    }
    public boolean removeFigure(Figure figure){
        boolean result = false ;
        if(figures.contains(figure)) {
            figures.remove(figure);
            result = true;
        }
        return result;
    }
    public String showFigures() {
        String result = null;
        for (int n = 0; n < figures.size(); n++) {
            result = "This is" + figures.get(n).getFigureName() + ", its field amounts " + figures.get(n).getField()+"\n";
        }
        return result;
    }
    public int getListSize() {
        return figures.size();
    }
}
