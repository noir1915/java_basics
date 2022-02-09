import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.*;

public class RouteCalculatorTest extends TestCase {
    List<Station> route = new ArrayList<>();

    @Override
    protected void setUp() {
        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Station stationOne = new Station("1Ст.1Л", line1);
        Station stationOneLine = new Station("2Ст.1Л", line1);
        Station stationSecond = new Station("1Ст.2Лин", line1);
        Station stationThird = new Station("1Ст.2Лин", line2);
        line1.addStation(stationOne);
        line1.addStation(stationSecond);
        line1.addStation(stationThird);
        route.add(stationOne);
        route.add(stationOneLine);
        route.add(stationSecond);
        route.add(stationThird);
    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 8.5;
        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() {
    }

    public void testGetRouteOnTheLine() {
        List<Station> route = new ArrayList<>();
        StationIndex stationIndex = new StationIndex();
        Line line1 = new Line(1, "1");
        RouteCalculator routeCalculator = new RouteCalculator(stationIndex);
        Station stationFirst = new Station("Первая станция", line1);
        Station stationSecond = new Station("Вторая", line1);
        Station stationThird = new Station("Третья станция", line1);
        line1.addStation(stationFirst);
        line1.addStation(stationSecond);
        line1.addStation(stationThird);
        route.add(stationFirst);
        route.add(stationSecond);
        route.add(stationThird);
        boolean actual = routeCalculator.getShortestRoute(stationFirst, stationThird).equals(route);
        Collections.reverse(route);
        boolean actual1 = routeCalculator.getShortestRoute(stationThird, stationFirst).equals(route);
        boolean expected = true;
        assertEquals(expected, actual);
        assertEquals(expected, actual1);
    }

    public void testGetRouteWithOneConnections() {
        List<Station> route1 = new ArrayList<>();
        StationIndex stationIndex = new StationIndex();
        Line line1 = new Line(1, "1");
        Line line2 = new Line(2, "2");
        stationIndex.addLine(line1);
        RouteCalculator routeCalculator = new RouteCalculator(stationIndex);
        Station station1 = new Station("Станция1", line1);
        Station station2 = new Station("Станция2", line1);
        Station station3 = new Station("Станция3", line2);
        line1.addStation(station1);
        line2.addStation(station1);
        line2.addStation(station2);
        line2.addStation(station3);
        route1.add(station1);
        route1.add(station2);
        route1.add(station3);
        routeCalculator.getShortestRoute(station1, station3);
        boolean actual = station1.getLine().equals(station3.getLine());
        boolean expected = false;
        assertEquals(expected, actual);
    }

    public void testGetRouteViaConnectedLine() {
        StationIndex stationIndex = new StationIndex();
        RouteCalculator routeCalculator = new RouteCalculator(stationIndex);
        List<Station> from = new ArrayList<>(); // откуда
        List<Station> to = new ArrayList<>(); // откуда
        Line line = new Line(1, "1");
        Line line1 = new Line(1, "1");
        Station station = new Station("1", line);
        Station station1 = new Station("1", line1);
        stationIndex.addLine(line);
        stationIndex.addLine(line1);
        stationIndex.addStation(station);
        stationIndex.addStation(station1);
        line.addStation(station);
        line.addStation(station1);
        line1.addStation(station);
        line1.addStation(station1);
        from.add(station);
        to.add(station);
        stationIndex.addConnection(from);
        stationIndex.addConnection(to);
        routeCalculator.getShortestRoute(station, station1);
        boolean actual = from.equals(to);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    public void testGetRouteWithTwoConnections() throws Exception {
        List<Station> route = new ArrayList<>();
        List<Station> connect1 = new ArrayList<>();
        List<Station> connect2 = new ArrayList<>();
        StationIndex stationIndex = new StationIndex();
        Line line1 = new Line(1, "1");
        Line line2 = new Line(2, "2");
        Line line3 = new Line(3, "3");
        Station stationFirst = new Station("1", line1);
        Station stationSecond = new Station("2", line1);
        Station stationThird = new Station("3", line1);
        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);
        line1.addStation(stationFirst);
        line1.addStation(stationSecond);
        line1.addStation(stationThird);
        line1.getStations().forEach(stationIndex::addStation);

        route.add(new Station("1", line2));
        route.add(new Station("2", line2));
        route.add(new Station("3", line2));
        route.forEach(stationIndex::addStation);

        Station stationFirst3 = new Station("1", line3);
        Station stationSecond3 = new Station("2", line3);
        Station stationThird3 = new Station("3", line3);

        line3.addStation(stationFirst3);
        line3.addStation(stationSecond3);
        line3.addStation(stationThird3);
        line3.getStations().forEach(stationIndex::addStation);

        connect1.add(stationIndex.getStation("1", 1)); // 2.5
        connect1.add(stationIndex.getStation("1", 2));
        stationIndex.addConnection(connect1);

        connect2.add(stationIndex.getStation("1", 2));  // 3.5
        connect2.add(stationIndex.getStation("1", 3));  // 3.5
        stationIndex.addConnection(connect2);
        List<Station> way = new ArrayList<>();
        way.addAll(connect1);
        way.addAll(connect2);
        System.out.println(RouteCalculator.calculateDuration(way));
        double expected = 9.5;
        double actual = RouteCalculator.calculateDuration(way);
        assertEquals(expected, actual);

    }
}