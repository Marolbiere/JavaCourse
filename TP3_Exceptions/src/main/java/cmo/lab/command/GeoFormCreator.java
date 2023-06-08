package cmo.lab.command;

public abstract class GeoFormCreator {
    private String geoInfo;
    public GeoFormCreator(String geoInfo) {
        this.geoInfo=geoInfo;
    }

    public void createForm() {
        switch (geoInfo.toLowerCase()) {
            case "circle":

                break;
            case "triangle":
                break;
            case "rectangle":
                RectangleFormCreator rfc = new RectangleFormCreator();
                rfc.getData();
                break;
        }
    }

}
