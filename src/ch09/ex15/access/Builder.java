package ch09.ex15.access;

/**
 * Created by V1 on 13-Feb-17.
 */
public interface Builder extends WaterMaker, GasMaker, AirMaker {
    void buildStart();
}
