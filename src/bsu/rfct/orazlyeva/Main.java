package bsu.rfct.orazlyeva;

public class Main {

    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        int i = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[i] = new Cheese();
            }
            if (parts[0].equals("Apple")) {
                breakfast[i] = new Apple(parts[1]);
            }
            if (parts[0].equals("Pie")) {

                breakfast[i] = new Pie(parts[1]);
            }
            i++;
        }
        for (Food food : breakfast) {
            if (food != null)
                food.consume();
            else
                break;

        }
        System.out.println("Всего хорошего!");
        byte a=0,c=0,p=0;
        for (Food food:breakfast){
            if (food != null){
                if(food.getName().equals("Apple")){
                    a++;}
                if(food.getName().equals("Cheese")){
                    c++;
                }
                if(food.getName().equals("Pie")){
                    p++;
                }
            }
            else
                break;
        }
        System.out.println("kolichestvo Apple = "+a);
        System.out.println("kolichestvo Cheese = "+c);
        System.out.println("kolichestvo Pie = "+p);
    }
}
