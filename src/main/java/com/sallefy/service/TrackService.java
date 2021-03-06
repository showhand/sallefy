package com.sallefy.service;

import com.sallefy.service.dto.TrackDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service Interface for managing {@link com.sallefy.domain.Track}.
 */
public interface TrackService {

    /**
     * Save a track.
     *
     * @param trackDTO the entity to save.
     * @return the persisted entity.
     */
    TrackDTO save(TrackDTO trackDTO);

    /**
     * Get all the tracks.
     *
     * @return the list of entities.
     */
    List<TrackDTO> findAll();

    /**
     * Get all the tracks with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
    Page<TrackDTO> findAllWithEagerRelationships(Pageable pageable);

    /**
     * Get the "id" track.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    TrackDTO findOne(Long id);

    /**
     * Delete the "id" track.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

    /**
     * Find the tracks by ids
     *
     * @param tracksIds the ids of the entity
     * @return the list of tracks
     */
    List<TrackDTO> findByIds(List<Long> tracksIds);

    /**
     * Find all tracks by the current user
     *
     * @return the list of tracks
     */
    List<TrackDTO> findAllByCurrentUser();


    /**
     * Find all the liked tracks by the current user
     *
     * @return the list of tracks
     */
    List<TrackDTO> findAllCurrentUserLiked();

    /**
     * Find track by current user and the "id" of the track
     * @param trackId the id of the track
     * @return the track
     */
    TrackDTO findOwnTrackById(Long trackId);

    /**
     * Method to find all tracks by the "login" of a user
     * @param login the login pf a user
     * @return the tracks list
     */
    List<TrackDTO> findAllByUserLogin(String login);

    /**
     * Method to find all tracks by genre "id"
     *
     * @param id the id of the genre
     * @return the list of tracks
     */
    List<TrackDTO> findTracksByGenreId(Long id);
}
