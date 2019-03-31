package com.kodilla.patterns.prototype;


import java.util.HashSet;
import java.util.Set;

//oznaczona do klonowania extends
public final class Board extends Prototype {
    String name;
    Set<TasksList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for (TasksList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    //Wady -> Sklonowaniu ulega również właściwość lists, czyli
    //do nowego obiektu klasy Board do właściwości lists zostanie wpisana taka sama wartość, jaka była w
    //oryginalnym obiekcie, a więc referencja do tego samego obiektu HashSet.
    //oiekt dodany w oryginale doda go we wszystkich kopiach
    //te same adrey przypisuje w kopiowanym obiekcie
    public Board shallowCopy() throws CloneNotSupportedException {
        return (Board) super.clone();
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board clonedBoard = (Board) super.clone();
        // tworzy nowy obiekt HashSet
        //dla każdego zdaania na liście przypisuje do nowego obiektu
        //dla każdej listy zadań tworzona jest nowa lista typu TasksList
        clonedBoard.lists = new HashSet<>();
        for (TasksList theList: lists){
            TasksList clonedList = new TasksList(theList.getName());
            for (Task task: theList.getTasks()) {
                clonedList.getTasks().add(task);
            }
            clonedBoard.getLists().add(clonedList);
        }

        return clonedBoard;
    }
}