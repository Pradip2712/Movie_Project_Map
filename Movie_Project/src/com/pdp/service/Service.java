package com.pdp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import com.pdp.dao.Dao;
import com.pdp.movie.ActorInfo;

public class Service {

	Dao d = new Dao();
	ActorInfo a = new ActorInfo();
	Map<String, List<ActorInfo>> m = d.actorsData();

	public Set<String> movies() {

		return m.keySet();

	}

	public List<Integer> moviesYers() {
		List<Integer> abc = new ArrayList<Integer>();
		for (Entry<String, List<ActorInfo>> map : m.entrySet()) {

			List<ActorInfo> actorinfo = map.getValue();

			for (ActorInfo ai2 : actorinfo) {
				abc.add(ai2.getmYear());
			}

		}

		return abc;
	}

	public List<String> moviesName(int year) {

		List<String> mname = new ArrayList<String>();
		for (Entry<String, List<ActorInfo>> map : m.entrySet()) {
			List<ActorInfo> actorinfo = map.getValue();

			for (ActorInfo ai2 : actorinfo) {
				if (ai2.getmYear() == year) {
					mname.add(ai2.getmName());
				}
			}

		}

		return mname;
	}

	static String acname = null;

	public List<String> actorsName(String acname) {

		List<String> actnames = new ArrayList<String>();
		for (Entry<String, List<ActorInfo>> map : m.entrySet()) {
			List<ActorInfo> actorinfo = map.getValue();
			for (ActorInfo ai2 : actorinfo) {
				if (ai2.getmName().equalsIgnoreCase(acname)) {
					actnames.add(ai2.getName());
				}
			}
		}
		return actnames;
	}

	public List<ActorInfo> actorDeetails(String aname) {

		List<ActorInfo> actDetails = new ArrayList<ActorInfo>();
		for (Entry<String, List<ActorInfo>> map : m.entrySet()) {
			List<ActorInfo> actorInfo = map.getValue();
			for (ActorInfo ai2 : actorInfo) {
				if (ai2.getName().equalsIgnoreCase(aname)) {
					actDetails.add(ai2);
				}
			}
		}

		return actDetails;
	}

}
