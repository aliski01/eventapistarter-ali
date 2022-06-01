package com.dcsg.eventApi.dto;

import java.io.Serializable;
import java.util.ArrayList;

public class Performer implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -5467177544010954615L;
	public String type;
	    public String name;
	    public String image;
	    public int id;
	    public Images images;
	    public Object divisions;
	    public boolean has_upcoming_events;
	    public boolean primary;
	    public Stats stats;
	    public ArrayList<Taxonomy> taxonomies;
	    public String image_attribution;
	    public String url;
	    public double score;
	    public String slug;
	    public int home_venue_id;
	    public String short_name;
	    public int num_upcoming_events;
	    public Object colors;
	    public String image_license;
	    public int popularity;
	    public Location location;
	    public String image_rights_message;
	    public boolean home_team;
	    public boolean away_team;
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Images getImages() {
			return images;
		}
		public void setImages(Images images) {
			this.images = images;
		}
		public Object getDivisions() {
			return divisions;
		}
		public void setDivisions(Object divisions) {
			this.divisions = divisions;
		}
		public boolean isHas_upcoming_events() {
			return has_upcoming_events;
		}
		public void setHas_upcoming_events(boolean has_upcoming_events) {
			this.has_upcoming_events = has_upcoming_events;
		}
		public boolean isPrimary() {
			return primary;
		}
		public void setPrimary(boolean primary) {
			this.primary = primary;
		}
		public Stats getStats() {
			return stats;
		}
		public void setStats(Stats stats) {
			this.stats = stats;
		}
		public ArrayList<Taxonomy> getTaxonomies() {
			return taxonomies;
		}
		public void setTaxonomies(ArrayList<Taxonomy> taxonomies) {
			this.taxonomies = taxonomies;
		}
		public String getImage_attribution() {
			return image_attribution;
		}
		public void setImage_attribution(String image_attribution) {
			this.image_attribution = image_attribution;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public double getScore() {
			return score;
		}
		public void setScore(double score) {
			this.score = score;
		}
		public String getSlug() {
			return slug;
		}
		public void setSlug(String slug) {
			this.slug = slug;
		}
		public int getHome_venue_id() {
			return home_venue_id;
		}
		public void setHome_venue_id(int home_venue_id) {
			this.home_venue_id = home_venue_id;
		}
		public String getShort_name() {
			return short_name;
		}
		public void setShort_name(String short_name) {
			this.short_name = short_name;
		}
		public int getNum_upcoming_events() {
			return num_upcoming_events;
		}
		public void setNum_upcoming_events(int num_upcoming_events) {
			this.num_upcoming_events = num_upcoming_events;
		}
		public Object getColors() {
			return colors;
		}
		public void setColors(Object colors) {
			this.colors = colors;
		}
		public String getImage_license() {
			return image_license;
		}
		public void setImage_license(String image_license) {
			this.image_license = image_license;
		}
		public int getPopularity() {
			return popularity;
		}
		public void setPopularity(int popularity) {
			this.popularity = popularity;
		}
		public Location getLocation() {
			return location;
		}
		public void setLocation(Location location) {
			this.location = location;
		}
		public String getImage_rights_message() {
			return image_rights_message;
		}
		public void setImage_rights_message(String image_rights_message) {
			this.image_rights_message = image_rights_message;
		}
		public boolean isHome_team() {
			return home_team;
		}
		public void setHome_team(boolean home_team) {
			this.home_team = home_team;
		}
		public boolean isAway_team() {
			return away_team;
		}
		public void setAway_team(boolean away_team) {
			this.away_team = away_team;
		}
		@Override
		public String toString() {
			return "Performer [type=" + type + ", name=" + name + ", image=" + image + ", id=" + id + ", images="
					+ images + ", divisions=" + divisions + ", has_upcoming_events=" + has_upcoming_events
					+ ", primary=" + primary + ", stats=" + stats + ", taxonomies=" + taxonomies
					+ ", image_attribution=" + image_attribution + ", url=" + url + ", score=" + score + ", slug="
					+ slug + ", home_venue_id=" + home_venue_id + ", short_name=" + short_name
					+ ", num_upcoming_events=" + num_upcoming_events + ", colors=" + colors + ", image_license="
					+ image_license + ", popularity=" + popularity + ", location=" + location
					+ ", image_rights_message=" + image_rights_message + ", home_team=" + home_team + ", away_team="
					+ away_team + "]";
		}
	    
}
