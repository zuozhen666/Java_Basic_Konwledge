package com.zuozhen.enumlearing;

/*
枚举类
1.枚举类的理解：类的对象只有有限个，确定的，我们称此类为枚举类
2.当需要定义一组常量时，建议使用枚举类
3.如果枚举类中只有一个对象，则可以作为单例模式的实现方式
如何定义：
1.jdk5.0之前，自定义枚举类
2.jdk5.0之后，使用enum关键字，定义的枚举类继承于Enum类

//Enum类中的常用方法
    values()方法：返回枚举类型的对象数组，该方法可以很方便的遍历所有的枚举值
    valuesOf(String str)：可以把一个字符串转为对应的枚举类对象，要求字符串必须是枚举类对
    toString()：返回当前枚举对象常量的名称
 */
public class FirstTest {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season);
        //toString()
        System.out.println(Season1.SPRING);//默认toString为显示对象名，如果有需求重写即可
        //values
        Season1[] values = Season1.values();
        for (Season1 season1 : values) {
            System.out.println(season1);
        }
        //valuesOf(String objName)
        Season1 valueOf = Season1.valueOf("WINTER");//对象名如果不存在就会抛出异常
        System.out.println(valueOf);
    }
}

enum Season1 {
    //1.提供当前枚举类的对象
    SPRING("春天"),
    SUMMER("夏天"),
    AUTUMN("秋天"),
    WINTER("冬天");

    //2.声明
    private final String seasonName;

    //3.构造器
    Season1(String seasonName) {
        this.seasonName = seasonName;
    }
}

//自定义实现枚举类
class Season {
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供多个对象
    public static final Season SPRING = new Season("春天", "春");
    public static final Season SUMMER = new Season("夏天", "夏");
    public static final Season AUTUMN = new Season("秋天", "秋");
    public static final Season WINTER = new Season("冬天", "冬");

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
