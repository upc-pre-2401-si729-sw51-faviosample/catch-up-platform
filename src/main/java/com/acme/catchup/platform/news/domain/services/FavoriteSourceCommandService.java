package com.acme.catchup.platform.news.domain.services;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import com.acme.catchup.platform.news.domain.model.commands.CreateFavoriteSourceCommand;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface FavoriteSourceCommandService {
    Optional<FavoriteSource> handle(CreateFavoriteSourceCommand command);
}
