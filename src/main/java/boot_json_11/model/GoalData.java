package boot_json_11.model;


  
public class GoalData
{
    private String id;

    private String goals;

    private String lon;

    private String chances_max;

    private String chances_left;

    private String lat;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getGoals ()
    {
        return goals;
    }

    public void setGoals (String goals)
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

    public String getChances_max ()
    {
        return chances_max;
    }

    public void setChances_max (String chances_max)
    {
        this.chances_max = chances_max;
    }

    public String getChances_left ()
    {
        return chances_left;
    }

    public void setChances_left (String chances_left)
    {
        this.chances_left = chances_left;
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
        return "ClassPojo [id = "+id+", goals = "+goals+", lon = "+lon+", chances_max = "+chances_max+", chances_left = "+chances_left+", lat = "+lat+"]";
    }
}
			
			
