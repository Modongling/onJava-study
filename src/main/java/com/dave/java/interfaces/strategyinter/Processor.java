package com.dave.java.interfaces.strategyinter;

import com.dave.java.interfaces.Applicator;

import java.util.Arrays;
import java.util.Locale;

public interface Processor {
    default String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input);
}

interface StringProcessor extends Processor {
    @Override
    String process(Object input);
    static void main(String[] args) {
        String s = "We are such stuff as dreams are made on";
       Applicator.apply(new Upper2(), s);
       Applicator.apply(new Lower2(), s);
       Applicator.apply(new Splitter2(), s);
    }
}

/**
 * 接口策略模式
 */
class FilterAdapter implements Processor {
    Filter filter;
    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }

    @Override
    public String name() {
        return filter.name();
    }

    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        Applicator.apply(new FilterAdapter(new LowPass(1.0)), waveform);
        Applicator.apply(new FilterAdapter(new HighPass(2.0)), waveform);
        Applicator.apply(new FilterAdapter(new BandPass(3.0, 4.0)), waveform);
    }
}

class Upper2 implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase(Locale.ROOT);
    }
}

class Lower2 implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase(Locale.ROOT);
    }
}


class Splitter2 implements StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
