package dao.modelos.types;

public class HalfDamageToItem{
	private String name;
	private String url;

	public String getName(){
		return name;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return  name + " ";
		}
}
