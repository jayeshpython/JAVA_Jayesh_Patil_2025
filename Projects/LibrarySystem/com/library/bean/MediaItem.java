
package com.library.bean;

public abstract class MediaItem extends Item{
    private int runtime;   // in minutes

    public MediaItem(int id, String title, int numCopies, int runtime){
        super(id, title, numCopies);
        this.runtime = runtime;
    }

    public int getRunTime(){ return runtime;}
    public void detRunTime(int runtime){
        this.runtime = runtime;
    }
    
    @Override
    public String toString(){
        return super.toString() + " | RunTime: " + runtime + "mins";
    }
}