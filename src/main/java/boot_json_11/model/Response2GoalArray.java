package boot_json_11.model;

public class Response2GoalArray
{
    private GoalData[] goals;

    private String lon;

    private String status;

    private String radius;

    private String lat;

    public GoalData[] getGoals ()
    {
        return goals;
    }

    public void setGoals (GoalData[] goals)
    {
        this.goals = goals;
    }

    public String getLon ()
    {
        return lon;
    }

    public void setLon (String lon)
    {
        this.lon = lon;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getRadius ()
    {
        return radius;
    }

    public void setRadius (String radius)
    {
        this.radius = radius;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [goals = "+goals+", lon = "+lon+", status = "+status+", radius = "+radius+", lat = "+lat+"]";
    }
}
