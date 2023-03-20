package dev.renegade.bookmarkit.security.model.refreshToken;

public record TokenRefreshResponse(String tokenType, String refreshToken) {
  public TokenRefreshResponse(String refreshToken) {
    this("Bearer", refreshToken);
  }
}