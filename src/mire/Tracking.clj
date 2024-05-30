(ns mire.Tracking)

(def player-track (ref #{}))

(defn track-player [player-name]
  (dosync
    (alter player-track conj player-name)))

(defn get-tracked-players []
  @player-track)
