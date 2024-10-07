package com.pdp.controller;

import java.util.List;
import java.util.Set;

import com.pdp.movie.ActorInfo;
import com.pdp.service.Service;

public class Controll {

	Service s = new Service();

	public Set<String> movies() {
		Set<String> keyset = s.movies();
		return keyset;

	}

	public List<Integer> moviesYers() {
		List<Integer> mname = s.moviesYers();

		return mname;
	}

	public List<String> moviesName(int year) {

		List<String> names = s.moviesName(year);
		return names;
	}

	public List<String> actorsName(String acname) {
		List<String> actnames = s.actorsName(acname);
		return actnames;
	}

	public List<ActorInfo> actorDetails(String aname) {

		List<ActorInfo> actName = s.actorDeetails(aname);
		return actName;
	}

}
