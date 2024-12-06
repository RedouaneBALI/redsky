package com.github.redouanebali.dto.follow;

import com.github.redouanebali.dto.Paginated;
import com.github.redouanebali.dto.actor.Actor;
import java.util.List;
import lombok.Data;

@Data
public class FollowsResponse implements Paginated {

  private Actor       subject;
  private List<Actor> follows;
  private String      cursor;

  @Override
  public List retrieveItems() {
    return follows;
  }
}