public class Person {
    //直角在左为true，直角在右为false
    public void drawStar(int line, boolean f) {
        if (f) {
            for (int i = 1; i <= line; i++) {
                for (int j = line; j >= i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= line; i++) {
                for(int j=1;j<=line;j++){
                    System.out.print("*");
                }

                for (int j = line; j <= i-1; j++) {
                    System.out.print(" ");
                }
                for (int j = line; j >= i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
        /*
        for (int i = 1; i <= line; i++) {
            if (!f) {
                for (int j = 1; j <= line - i; j++) {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    public void eat(int count, String something) {
        System.out.println("吃了" + count + "碗" + something);
    }

    public String tellname() {
        System.out.println("名字叫：");
        return "赵小涛";
    }

    public String buyDrink(int money) {
        if (money > 5) {
            return "红牛";
        } else {
            return "矿泉水";
        }
    }
 */

