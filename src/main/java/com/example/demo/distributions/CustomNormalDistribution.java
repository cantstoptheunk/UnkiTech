package com.example.demo.distributions;

import org.apache.commons.math3.distribution.NormalDistribution;

public class CustomNormalDistribution {

    public static final NormalDistribution ND_DEFAULT_AVG_SD = new NormalDistribution(50, 13);
    public static final NormalDistribution ND_DEFAULT_HIGH_SD = new NormalDistribution(50, 20);
    public static final NormalDistribution ND_DEFAULT_LOW_SD = new NormalDistribution(50, 6);

    public static final NormalDistribution ND_LOW_AVG_SD = new NormalDistribution(35, 10);
    public static final NormalDistribution ND_LOW_HIGH_SD = new NormalDistribution(35, 16);
    public static final NormalDistribution ND_LOW_LOW_SD = new NormalDistribution(35, 4);

    public static final NormalDistribution ND_VERY_LOW_AVG_SD = new NormalDistribution(20, 8);
    public static final NormalDistribution ND_VERY_LOW_HIGH_SD = new NormalDistribution(20, 12);
    public static final NormalDistribution ND_VERY_LOW_LOW_SD = new NormalDistribution(20, 4);


    public static final NormalDistribution ND_HIGH_AVG_SD = new NormalDistribution(65, 10);
    public static final NormalDistribution ND_HIGH_HIGH_SD = new NormalDistribution(65, 16);
    public static final NormalDistribution ND_HIGH_LOW_SD = new NormalDistribution(65, 4);

    public static final NormalDistribution ND_VERY_HIGH_AVG_SD = new NormalDistribution(80, 8);
    public static final NormalDistribution ND_VERY_HIGH_HIGH_SD = new NormalDistribution(80, 12);
    public static final NormalDistribution ND_VERY_HIGH_LOW_SD = new NormalDistribution(80, 4);
}
