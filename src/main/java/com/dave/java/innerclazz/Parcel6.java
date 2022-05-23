package com.dave.java.innerclazz;

public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            /**
             * 作用域在最近的花括号内部
             */
            class TrackingSlip {
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }
                String getSlip() {
                    return id;
                }
            }
            TrackingSlip slip = new TrackingSlip("slip");
        }
    }
    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();
    }
}
