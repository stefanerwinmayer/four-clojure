(ns problem88)

(def test-cases
  '[(= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
    (= (__ #{:a :b :c} #{}) #{:a :b :c})
    (= (__ #{} #{4 5 6}) #{4 5 6})
    (= (__ #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})])

(def __
  #(clojure.set/difference (clojure.set/union %1 %2)
                           (clojure.set/intersection %1 %2))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
