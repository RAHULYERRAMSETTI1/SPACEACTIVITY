package andy.nasa.models;

import java.util.ArrayList;
import java.util.List;

import andy.nasa.main.widget.ContactItemInterface;

public class ExampleDataSource {

	public static List<ContactItemInterface> getSampleContactList(){
		 List<ContactItemInterface>  list = new  ArrayList<ContactItemInterface> ();
		
		 list.add(new ExampleContactItem("ACE" ,"http://www.srl.caltech.edu/ACE/") );
		 list.add(new ExampleContactItem("Apollo" , "http://www.nasa.gov/mission_pages/apollo/index.html" ) );
		 /*list.add(new ExampleContactItem("Aqua" , "http://www.nasa.gov/mission_pages/aqua/index.html" ) );
		 list.add(new ExampleContactItem("Aquarius" , "http://www.nasa.gov/mission_pages/aquarius/main/index.html" ) );
		 list.add(new ExampleContactItem("ARCTAS" , "Gracia Ringdahl" ) );
		 list.add(new ExampleContactItem("ARTEMIS" , "http://www.nasa.gov/mission_pages/artemis/index.html" ) );
		 list.add(new ExampleContactItem("Asteroid Redirect Initiative" , "http://www.nasa.gov/mission_pages/asteroids/initiative/index.html" ) );
		 list.add(new ExampleContactItem("ASTRO-1" , "http://nssdc.gsfc.nasa.gov/nmc/masterCatalog.do?sc=ASTRO-1" ) );
		 list.add(new ExampleContactItem("ASTRO-2" , "http://nssdc.gsfc.nasa.gov/nmc/masterCatalog.do?sc=ASTRO-2" ) );
		 list.add(new ExampleContactItem("Aura" , "http://www.nasa.gov/mission_pages/aura/main/index.html" ) );
		 
		 list.add(new ExampleContactItem("CALIPSO" , "http://www.nasa.gov/mission_pages/calipso/main/index.html" ) );
		 list.add(new ExampleContactItem("Cassini-Huygens" , "http://www.nasa.gov/mission_pages/cassini/main/index.html" ) );
		 list.add(new ExampleContactItem("CHAMP" , "http://science.nasa.gov/missions/champ/" ) );
		 list.add(new ExampleContactItem("Chandra X-Ray Observatory" , "http://www.nasa.gov/mission_pages/chandra/main/index.html" ) );
		 list.add(new ExampleContactItem("CINDI" , "http://www.nasa.gov/mission_pages/cindi/" ) );
		 list.add(new ExampleContactItem("Clementine" , "http://nssdc.gsfc.nasa.gov/planetary/clementine.html" ) );
		 list.add(new ExampleContactItem("Cloudsat" , "http://www.nasa.gov/mission_pages/cloudsat/main/index.html" ) );
		 list.add(new ExampleContactItem("Cluster ESA/NASA Mission" , "http://sci.esa.int/science-e/www/area/index.cfm?fareaid=8" ) );
		 list.add(new ExampleContactItem("Commercial Crew" , "http://www.nasa.gov/exploration/commercial/crew/index.html" ) );
		 
		 
		 list.add(new ExampleContactItem("Commercial Space Transportation" , "http://www.nasa.gov/exploration/commercial/index.html" ) );
		 list.add(new ExampleContactItem("Compton Gamma-Ray Observatory" , "http://cossc.gsfc.nasa.gov/docs/cgro/cossc/" ) );
		 list.add(new ExampleContactItem("Cosmic Background Explorer (COBE)" , "http://nssdc.gsfc.nasa.gov/database/MasterCatalog?sc=1989-089A" ) );
		 list.add(new ExampleContactItem("Cosmic Hot Interstellar Plasma Spectrometer (CHIPS)" , "http://chips.ssl.berkeley.edu/chips.html" ) );
		 list.add(new ExampleContactItem("CubeSats" , "http://www.nasa.gov/mission_pages/cubesats/index.html" ) );
		
		 
		 list.add(new ExampleContactItem("Dawn" , "http://www.nasa.gov/mission_pages/dawn/main/index.html" ) );
		 list.add(new ExampleContactItem("Deep Impact" , "http://www.nasa.gov/mission_pages/deepimpact/main/index.html" ) );
		 list.add(new ExampleContactItem("Earth Observing-1" , "http://eo1.gsfc.nasa.gov/" ) );

list.add(new ExampleContactItem("Earth Probe Total Ozone Mapping Spectrometer (EP-TOMS)" , "http://toms.gsfc.nasa.gov/eptoms/ep.html" ) );

list.add(new ExampleContactItem("Earth Radiation Budget Satellite" , "http://nasascience.nasa.gov/missions/erbs" ) );

list.add(new ExampleContactItem("EPOXI" , "http://www.nasa.gov/mission_pages/epoxi/index.html" ) );

list.add(new ExampleContactItem("Euclid" , "http://www.nasa.gov/mission_pages/euclid/main/index.html" ) );

list.add(new ExampleContactItem("Exploration Plans" , "http://www.nasa.gov/mission_pages/exploration/main/index.html" ) );

list.add(new ExampleContactItem("Explorer" , "http://www.nasa.gov/mission_pages/explorer/index.html" ) );

list.add(new ExampleContactItem("Extreme Ultraviolet Explorer" , "http://www.ssl.berkeley.edu/euve/" ) );

list.add(new ExampleContactItem("FAST" , "http://sprg.ssl.berkeley.edu/fast/" ) );

list.add(new ExampleContactItem("Fermi Gamma-ray Space Telescope" , "http://www.nasa.gov/mission_pages/GLAST/main/index.html" ) );

list.add(new ExampleContactItem("Fire and Smoke" , "http://www.nasa.gov/mission_pages/fires/main/index.html" ) );

list.add(new ExampleContactItem("FUSE" , "http://fuse.pha.jhu.edu/" ) );

list.add(new ExampleContactItem("GALEX" , "http://www.nasa.gov/mission_pages/galex/index.html" ) );

list.add(new ExampleContactItem("Galileo" , "http://www2.jpl.nasa.gov/galileo/" ) );

list.add(new ExampleContactItem("Gemini" , "http://www.nasa.gov/mission_pages/gemini/index.html" ) );

list.add(new ExampleContactItem("Genesis" , "http://www.nasa.gov/mission_pages/genesis/main/index.html" ) );

list.add(new ExampleContactItem("Geotail" , "http://pwg.gsfc.nasa.gov/geotail.shtml" ) );

list.add(new ExampleContactItem("GLAST" , "http://www.nasa.gov/mission_pages/GLAST/main/index.html" ) );

list.add(new ExampleContactItem("Global Precipitation Measurement (GPM)" , "http://www.nasa.gov/mission_pages/GPM/main/index.html" ) );

list.add(new ExampleContactItem("Glory" , "http://www.nasa.gov/mission_pages/Glory/main/index.html" ) );

list.add(new ExampleContactItem("GOES-N" , "http://www.nasa.gov/mission_pages/goes-n/main/index.html" ) );

list.add(new ExampleContactItem("Gravity Recovery and Climate Experiment (GRACE)" , "http://www.jpl.nasa.gov/missions/current/grace.html" ) );

list.add(new ExampleContactItem("Gravity Probe-B" , "http://www.nasa.gov/mission_pages/gpb/index.html" ) );



list.add(new ExampleContactItem("Herschel" , "http://www.nasa.gov/mission_pages/herschel/index.html" ) );
list.add(new ExampleContactItem("Hubble" , "http://www.nasa.gov/mission_pages/hubble/main/index.html") );
list.add(new ExampleContactItem("Hurricanes" , "http://www.nasa.gov/mission_pages/hurricanes/main/index.html" ) );


list.add(new ExampleContactItem("IBEX" , "http://www.nasa.gov/mission_pages/ibex/index.html" ) );
list.add(new ExampleContactItem("IMAGE" , "http://pluto.space.swri.edu/IMAGE/" ) );
list.add(new ExampleContactItem("International Gamma-Ray Astrophysics Laboratory (INTEGRAL)" , "http://sci.esa.int/science-e/www/area/index.cfm?fareaid=21" ) );
list.add(new ExampleContactItem("International Space Station" , "http://www.nasa.gov/mission_pages/station/main/index.html" ) );
list.add(new ExampleContactItem("IRIS: Interface Region Imaging Spectrograph" , "http://www.nasa.gov/mission_pages/iris/index.html" ) );
list.add(new ExampleContactItem("James Webb Space Telescope" , "http://www.nasa.gov/mission_pages/webb/main/index.html" ) );
list.add(new ExampleContactItem("Jason" , "http://science.hq.nasa.gov/missions/satellite_12.htm" ) );
list.add(new ExampleContactItem("Juno" , "http://www.nasa.gov/mission_pages/juno/main/index.html" ) );
list.add(new ExampleContactItem("Kepler" , "http://www.nasa.gov/mission_pages/kepler/main/index.html" ) );







list.add(new ExampleContactItem("LADEE: Lunar Atmosphere Dust Environment Explorer" , "http://www.nasa.gov/mission_pages/LADEE/main/" ) );
list.add(new ExampleContactItem("Landsat" , "http://landsat.gsfc.nasa.gov/" ) );

list.add(new ExampleContactItem("LRO (Lunar Reconnaissance Orbiter)" , "http://www.nasa.gov/mission_pages/LRO/main/index.html" ) );
list.add(new ExampleContactItem("Magnetospheric MultiScale (MMS)" , "http://www.nasa.gov/mission_pages/mms/index.html" ) );
list.add(new ExampleContactItem("Mariner" , "http://science1.nasa.gov/missions/mariner-missions/" ) );
list.add(new ExampleContactItem("Mars 2020 Mission Plans" , "http://mars.jpl.nasa.gov/m2020/" ) );
list.add(new ExampleContactItem("Mars Odyssey" , "http://www.nasa.gov/mission_pages/odyssey/index.html" ) );
list.add(new ExampleContactItem("Mars Pathfinder" , "http://www.nasa.gov/mission_pages/mars-pathfinder/index.html" ) );
list.add(new ExampleContactItem("Mercury" , "http://www.nasa.gov/mission_pages/mercury/index.html" ) );
list.add(new ExampleContactItem("Moon Mineralogy Mapper" , "http://moonmineralogymapper.jpl.nasa.gov/" ) );
list.add(new ExampleContactItem("Near Earth Asteroid Rendezvous (NEAR)" , "http://near.jhuapl.edu/" ) );
list.add(new ExampleContactItem("New Horizons" , "http://www.nasa.gov/mission_pages/newhorizons/main/index.html" ) );
list.add(new ExampleContactItem("Ocean Surface Topography Mission/Jason 2" , "http://www.nasa.gov/mission_pages/ostm/main/index.html" ) );
list.add(new ExampleContactItem("Orbiting Carbon Observatory-2" , "http://www.nasa.gov/mission_pages/oco2/index.html" ) );
list.add(new ExampleContactItem("Orion Multi-Purpose Crew Vehicle" , "http://www.nasa.gov/exploration/systems/mpcv/index.html" ) );
list.add(new ExampleContactItem("OSIRIS-REX" , "http://www.nasa.gov/mission_pages/osiris-rex/index.html" ) );
list.add(new ExampleContactItem("Phoenix" , "http://www.nasa.gov/mission_pages/phoenix/main/index.html" ) );
list.add(new ExampleContactItem("Pioneer" , "http://www.nasa.gov/mission_pages/pioneer/index.html" ) );
list.add(new ExampleContactItem("Planck" , "http://www.nasa.gov/mission_pages/planck/index.html" ) );
list.add(new ExampleContactItem("Polar" , "http://pwg.gsfc.nasa.gov/polar/" ) );
list.add(new ExampleContactItem("QuikSCAT" , "http://science.hq.nasa.gov/missions/satellite_51.htm" ) );
list.add(new ExampleContactItem("Radiation Belt Storm Probes/Van Allen Probes" , "1" ) );
list.add(new ExampleContactItem("Ranger" , "http://solarsystem.nasa.gov/missions/profile.cfm?Sort=Target&Target=Moon&MCode=Ranger" ) );
list.add(new ExampleContactItem("Rosetta" , "http://sci.esa.int/science-e/www/area/index.cfm?fareaid=13" ) );
list.add(new ExampleContactItem("Shuttle-Mir" , "http://www.nasa.gov/mission_pages/shuttle-mir/index.html" ) );
list.add(new ExampleContactItem("Shuttle Radar Topography Mission" , "http://www2.jpl.nasa.gov/srtm/" ) );
list.add(new ExampleContactItem("Skylab" , "http://www.nasa.gov/mission_pages/skylab/index.html" ) );
list.add(new ExampleContactItem("Solar Radiation and Climate Experiment (SORCE)" , "http://science.hq.nasa.gov/missions/satellite_21.htm" ) );
list.add(new ExampleContactItem("Surveyor" , "http://solarsystem.nasa.gov/missions/profile.cfm?Sort=Target&Target=Moon&MCode=Surveyor" ) );
list.add(new ExampleContactItem("Swift" , "http://www.nasa.gov/mission_pages/swift/main/index.html" ) );










list.add(new ExampleContactItem("Terra" , "http://www.nasa.gov/mission_pages/terra/index.html" ) );
list.add(new ExampleContactItem("THEMIS" , "http://www.nasa.gov/mission_pages/themis/main/index.html" ) );
list.add(new ExampleContactItem("TOPEX/Poseidon" , "http://science.hq.nasa.gov/missions/satellite_14.htm" ) );
list.add(new ExampleContactItem("TRACE" , "http://trace.lmsal.com/" ) );
list.add(new ExampleContactItem("Upper Atmosphere Radiation Satellite (UARS)" , "http://www.nasa.gov/mission_pages/uars/index.html" ) );
list.add(new ExampleContactItem("Viking" , "http://solarsystem.nasa.gov/missions/profile.cfm?Sort=Alpha&Letter=V&Alias=Viking%2001" ) );
list.add(new ExampleContactItem("Voyager" , "http://www.nasa.gov/mission_pages/voyager/index.html" ) );
list.add(new ExampleContactItem("WIND" , "http://www-spof.gsfc.nasa.gov/istp/wind/" ) );
list.add(new ExampleContactItem("WISE " , "http://www.nasa.gov/mission_pages/WISE/main/index.html" ) );
list.add(new ExampleContactItem("Wilkinson Microwave Anisotropy Probe (WMAP)" , "http://map.gsfc.nasa.gov/" ) );
list.add(new ExampleContactItem("XMM Newton" , "http://sci.esa.int/science-e/www/object/index.cfm?fobjectid=31249" ) );























		*/
		 
		 return list;
	}
	
	
}
