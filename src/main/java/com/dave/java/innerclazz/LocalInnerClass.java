package com.dave.java.innerclazz;

/**
 * LocalInnerClass.class
 */
public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        /**
         * LocalInnerClass$1LocalCounter.class
         */
        class LocalCounter implements Counter {
            //可以拥有构造器
            LocalCounter() {
                System.out.println("LocalCounter()");
            }

            @Override
            public int next() {
                //访问final形参
                System.out.print(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    /**
     * LocalInnerClass$1.class
     * @param name
     * @return
     */
    Counter getCounter2(final String name) {
        return new Counter() {
            //匿名类初始化块，不能有构造器
            {
                System.out.println("Counter()");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Local inner "),
                c2 = lic.getCounter2("Anonymous inner ");
        for (int i = 0; i < 5; i++)
            System.out.println(c1.next());
        for (int i = 0; i < 5; i++)
            System.out.println(c2.next());
    }
}

/**
 * Counter.class
 */
interface Counter {
    int next();
}
