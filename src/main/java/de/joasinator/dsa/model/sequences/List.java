package de.joasinator.dsa.model.sequences;

import java.util.function.Function;

public class List extends Position{

    Position front(){
        return null;
    }

    Position last(){
        return null;
    }

    Position next(Position pos){
        return null;
    }

    Position previous(Position pos){
        return null;
    }

    boolean bol(Position pos){
        return false;
    }

    boolean eol(Position pos) {
        return false;
    }

    List insert(Position pos, Element value){
        return null;
    }

    List delete(Position pos){
        return null;
    }
    List concat( List list){
        return null;
    }
    boolean isEmpty(){
        return false;
    }
    Position find(Function<Element, Boolean> func){
        return null;
    }
    Element retrieve(Position pos){
        return null;
    }
}
