public class Car {
    private String model;
    private String colour;
   private int productionDate;

    protected String getModel(){
        return model;
    }
    protected void setModel(String model){
        this.model=model;
    }
    protected String getColour(){
        return colour;
    }
    protected void setColour(String colour){
        this.colour=colour;
    }
    protected int getProductionDate(){
        return productionDate;
    }
    protected void setProductionDate(int productionDate){
        this.productionDate=productionDate;

    }
    void drive(){
        System.out.println("I can drive!");
    }
   void stop(){
        System.out.println("I stop now!");
    }

}
