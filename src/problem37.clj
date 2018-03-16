(ns problem37)

(def test-cases
  '[(= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))])

(def __
  "ABC"
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
