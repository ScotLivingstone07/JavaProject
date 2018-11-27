package part02;

public enum SupRegion {
	UNITED_KINGDOM {
		@Override
		String getRegionAsString() {
			// TODO Auto-generated method stub
			return "UNITED KINGDOM";
		}
	}, EUROPE {
		@Override
		String getRegionAsString() {
			// TODO Auto-generated method stub
			return "EUROPE";
		}
	}, OUTSIDE_EU {
		@Override
		String getRegionAsString() {
			// TODO Auto-generated method stub
			return "OUTSIDE EUROPE";
		}
	};
	
	
	abstract  String getRegionAsString();

}
