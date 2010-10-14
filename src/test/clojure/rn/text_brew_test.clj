(ns rn.text-brew-test
  (:import [com.relaynetwork TextBrew])
  (:use [clojure.test]))


(def *basic-levenshtien-examples*
     [{:dist 1.0 :left "apple" :right "opple"}
      {:dist 0.0 :left ""      :right ""}
      {:dist 0.0 :left nil     :right nil}
      {:dist 0.0 :left "foo"   :right "foo"}
      {:dist 1.0 :left "foox"  :right "foo"}
      {:dist 1.0 :left "foo"   :right "foox"}
      {:dist 1.0 :left "xfoo"  :right "foo"}
      {:dist 1.0 :left "foo"   :right "xfoo"}
      {:dist 3.0 :left "foo"   :right ""}
      {:dist 3.0 :left ""      :right "foo"}])

(deftest basic-levenshtien-examples
  (doseq [{left :left right :right dist :dist} *basic-levenshtien-examples*]
    (is (= dist (.cost (TextBrew/compare left right))))))

(comment

  (doseq [{left :left right :right dist :dist} *basic-levenshtien-examples*]
    (printf "%s vs %s = %f/%f\n" left right dist (.cost (TextBrew/compare left right))))


  (basic-levenshtien-examples)

  (.cost (TextBrew/compare "apple" "wpple"))

  )

