package org.example;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private  String name;
    private String sex;
    private int year;
    private Human father;
    private Human mather;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getYear() {
        return year;
    }

    public Human getFather() {
        return father;
    }

    public Human getMather() {
        return mather;
    }

    public Human(String name, String sex, int year, Human father, Human mather) {
        this.name = name;
        this.sex = sex;
        this.year = year;
        this.father = father;
        this.mather = mather;


    }
    /* выводит родителей человека*/
    public List getParents(){
        List parents = new ArrayList<Human>();
        parents.add(this.father);
        parents.add(this.mather);
        return  parents;
    }
    /* выводит детей человека*/
    public List getChilds(List<Human> people){
        List childs = new ArrayList<Human>();
        for (int i = 0; i < people.size(); i++) {
            if(people.get(i).getParents().contains(this)){
                childs.add(people.get(i));
            }
        }
        return childs;
    }

    public boolean isChild(Human child){
        if (this.equals(child.father) || this.equals(child.mather)){
            return true;
        }
        else return false;
    }

    public List getGrands(){
        List grands = new ArrayList<Human>();
        grands.add(this.father.getParents());
        grands.add(this.mather.getParents());
        return  grands;
    }
    public List getBrothersSisters(List<Human> people){
        List bs = new ArrayList<Human>();
        for (int i = 0; i < people.size(); i++) {
            if (!people.get(i).equals(this)) {
                if (people.get(i).getParents().contains(this.father) || (people.get(i).getParents().contains(this.father))) {
                    bs.add(people.get(i));
                }
            }
        }
        return bs;
    }
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", year=" + year +
                '}';
    }
}
