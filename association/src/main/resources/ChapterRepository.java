package main.resources;

import com.renereyes.association.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {}
public interface MemberRepository extends JpaRepository<Member, Long> {}
public interface EventRepository extends JpaRepository<Event, Long> {}
public interface GuestRepository extends JpaRepository<Guest, Long> {}
public interface ConferenceRepository extends JpaRepository<Conference, Long> {}
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {}
