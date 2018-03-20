(ns problem30)

(def test-cases
  '[(= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
    (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
    (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))])

(def __
  #(map first (partition-by identity %))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
