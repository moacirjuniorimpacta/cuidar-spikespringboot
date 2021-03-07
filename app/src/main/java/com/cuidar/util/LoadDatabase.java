package com.cuidar.util;

import java.util.Calendar;

import com.cuidar.model.MainFamilyMember;
import com.cuidar.model.enums.FamilyMemberCivilStatus;
import com.cuidar.model.enums.FamilyMemberGender;
import com.cuidar.repository.MainFamilyMemberRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(MainFamilyMemberRepo repository) {

    return args -> {
      log.info("Preloading " + repository.save(new MainFamilyMember("Principal 1", Calendar.getInstance().getTime(), FamilyMemberGender.Male, "11-11111", FamilyMemberCivilStatus.Single, "teste1@test.com")));
      log.info("Preloading " + repository.save(new MainFamilyMember("Principal 2", Calendar.getInstance().getTime(), FamilyMemberGender.Female, "22-22222", FamilyMemberCivilStatus.Single, "teste2@test.com")));
    };
  }
}