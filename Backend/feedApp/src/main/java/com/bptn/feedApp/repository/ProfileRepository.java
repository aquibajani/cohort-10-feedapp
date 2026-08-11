package com.bptn.feedApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bptn.feedApp.jpa.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
