package ENUM;

interface d{
    public String getDescription();
    public int getl();
}

public enum AnyEnum implements d {
    Constant_A {
        public String getDescription() {
            return ("我是枚举成员A");
        }

        public int getl() {
            return i;
        }
    },
    Constant_B {
        public String getDescription() {
            return ("我是枚举成员B");
        }

        public int getl() {
            return i;
        }
    },
    Constant_C {
        public String getDescription() {
            return ("我是枚举成员C");
        }

        public int getl() {
            return i;
        }
    },
    Constant_D {
        public String getDescription() {
            return ("我是枚举成员D");
        }

        public int getl() {
            return i;
        }
    };
    private static int i = 5;

    public static void main(String[] args) {
        for (int i = 0; i < AnyEnum.values().length; i++) {
            System.out.println(AnyEnum.values()[i] + "调用getDescription()方法为：" + AnyEnum.values()[i].getDescription());
            System.out.println(AnyEnum.values()[i] + "调用getl()方法为：" + AnyEnum.values()[i].getl());
        }
    }
}















