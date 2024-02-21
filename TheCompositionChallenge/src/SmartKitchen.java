public class SmartKitchen {

    private CoffeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        brewMaster = new CoffeMaker();
        iceBox     = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeFlag, boolean fridgeFlag,
                                boolean dishesWasherFlag){
            brewMaster.setHasWorkToDo(coffeFlag);
            iceBox.setHasWorkToDo(fridgeFlag);
            dishWasher.setHasWorkToDo(dishesWasherFlag);
    }

    public void doKitchenork(){
        brewMaster.brewCoffe();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

    class CoffeMaker {
        private boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }

        public void brewCoffe(){
            if (hasWorkToDo){
                System.out.println("Breing Coffe");
                hasWorkToDo = false;
            }
        }
    }

    class Refrigerator {
        private boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }

        public void orderFood(){
            if (hasWorkToDo){
                System.out.println("Ordering Food");
                hasWorkToDo = false;
            }
        }
    }

    class DishWasher {
        private boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }

        public void doDishes(){
            if (hasWorkToDo){
                System.out.println("Washing dishes");
                hasWorkToDo = false;
            }
        }
    }




}
