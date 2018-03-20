(ns problem41)

(def test-cases
  '[(= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
    (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
    (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])])

(def __
  (fn [seq n]
    (->> (partition-all n seq)
         (map #(take (dec n) %))
         (flatten)))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
