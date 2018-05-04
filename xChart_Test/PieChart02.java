import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.demo.charts.ExampleChart;

import java.awt.*;
import java.util.Random;

public class PieChart02 implements ExampleChart<PieChart> {

    public static void main(String[] args) {

        ExampleChart<PieChart> exampleChart = new PieChart02();
        PieChart chart = exampleChart.getChart();
        new SwingWrapper<PieChart>(chart).displayChart();
    }

    @Override
    public PieChart getChart() {

        // Create Chart
        PieChart chart = new PieChartBuilder().width(800).height(600).title(getClass().getSimpleName()).build();

        // Customize Chart
        Color[] sliceColors = new Color[] { newColorGenerator(), newColorGenerator(),newColorGenerator(),newColorGenerator(), newColorGenerator() };
        chart.getStyler().setSeriesColors(sliceColors);

        // Series
        chart.addSeries("Gold", 24);
        chart.addSeries("Silver", 21);
        chart.addSeries("Platinum", 39);
        chart.addSeries("Copper", 17);
        chart.addSeries("Zinc", 40);

        return chart;
    }

    private Color newColorGenerator() {
        int para1 = (int)(Math.random() * 256);
        int para2 = (int)(Math.random() * 256);
        int para3 = (int)(Math.random() * 256);
        return new Color(para1, para2, para3);

    }



}
