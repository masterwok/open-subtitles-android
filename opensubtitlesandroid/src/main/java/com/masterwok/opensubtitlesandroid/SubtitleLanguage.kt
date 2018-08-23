package com.masterwok.opensubtitlesandroid

import com.masterwok.opensubtitlesandroid.annotations.DisplayName
import com.masterwok.opensubtitlesandroid.extensions.getValue
import kotlin.reflect.KProperty1
import kotlin.reflect.KVisibility
import kotlin.reflect.full.memberProperties


/**
 * Open Subtitles language codes represented as ISO639-2.
 * See: https://www.opensubtitles.org/addons/export_languages.php
 */
@Suppress("unused")
class SubtitleLanguage private constructor() {

    data class Entry constructor(
            val name: String
            , val subLanguageId: String
    ) {
        override fun toString(): String = name
    }

    companion object {

        // I'm not a fan of reflection, but doing this makes the list of
        //Languages easier to maintain.
        private val supportedLanguagesLazy: List<Entry> by lazy {
            this::class
                    .memberProperties
                    .filter { it.visibility == KVisibility.PUBLIC && it.isConst }
                    .sortedBy { it.name }
                    .map { toLanguage(it) }
        }

        private fun toLanguage(
                it: KProperty1<out SubtitleLanguage.Companion, Any?>
        ): Entry = Entry(
                (it.annotations.first() as DisplayName).name
                , it.getValue<String>(SubtitleLanguage.Companion)!!
        )

        /**
         * TODO: DON'T USE REFLECTION TO DO THIS. IT'S TOO SLOW.
         * Get a list of names of supportedLanguages. The first call to this
         * method is going to be slow (~1200ms).
         */
        @JvmStatic
        val supportedLanguages: List<Entry>
            get() = supportedLanguagesLazy

        @DisplayName("Afar, afar")
        const val Afarafar = "aar"
        @DisplayName("Afrihili")
        const val Afrihili = "afh"
        @DisplayName("Afrikaans")
        const val Afrikaans = "afr"
        @DisplayName("Afro-Asiatic (Other)")
        const val AfrotoAsiatic = "afa"
        @DisplayName("Ainu")
        const val Ainu = "ain"
        @DisplayName("Akan")
        const val Akan = "aka"
        @DisplayName("Akkadian")
        const val Akkadian = "akk"
        @DisplayName("Albanian")
        const val Albanian = "alb"
        @DisplayName("Aleut")
        const val Aleut = "ale"
        @DisplayName("Algonquian languages")
        const val AlgonquianLanguages = "alg"
        @DisplayName("Altaic (Other)")
        const val Altaic = "tut"
        @DisplayName("Amharic")
        const val Amharic = "amh"
        @DisplayName("Apache languages")
        const val ApacheLanguages = "apa"
        @DisplayName("Arabic")
        const val Arabic = "ara"
        @DisplayName("Aragonese")
        const val Aragonese = "arg"
        @DisplayName("Aramaic")
        const val Aramaic = "arc"
        @DisplayName("Arapaho")
        const val Arapaho = "arp"
        @DisplayName("Araucanian")
        const val Araucanian = "arn"
        @DisplayName("Arawak")
        const val Arawak = "arw"
        @DisplayName("Armenian")
        const val Armenian = "arm"
        @DisplayName("Aromanian")
        const val Aromanian = "rup"
        @DisplayName("Artificial (Other)")
        const val Artificial = "art"
        @DisplayName("Assamese")
        const val Assamese = "asm"
        @DisplayName("Asturian")
        const val Asturian = "ast"
        @DisplayName("Athapascan languages")
        const val AthapascanLanguages = "ath"
        @DisplayName("Australian languages")
        const val AustralianLanguages = "aus"
        @DisplayName("Austronesian (Other)")
        const val Austronesian = "map"
        @DisplayName("Avaric")
        const val Avaric = "ava"
        @DisplayName("Avestan")
        const val Avestan = "ave"
        @DisplayName("Awadhi")
        const val Awadhi = "awa"
        @DisplayName("Aymara")
        const val Aymara = "aym"
        @DisplayName("Azerbaijani")
        const val Azerbaijani = "aze"
        @DisplayName("Balinese")
        const val Balinese = "ban"
        @DisplayName("Baltic (Other)")
        const val Baltic = "bat"
        @DisplayName("Baluchi")
        const val Baluchi = "bal"
        @DisplayName("Bambara")
        const val Bambara = "bam"
        @DisplayName("Bamileke languages")
        const val BamilekeLanguages = "bai"
        @DisplayName("Banda")
        const val Banda = "bad"
        @DisplayName("Bantu (Other)")
        const val Bantu = "bnt"
        @DisplayName("Basa")
        const val Basa = "bas"
        @DisplayName("Bashkir")
        const val Bashkir = "bak"
        @DisplayName("Basque")
        const val Basque = "baq"
        @DisplayName("Batak (Indonesia)")
        const val BatakIndonesia = "btk"
        @DisplayName("Beja")
        const val Beja = "bej"
        @DisplayName("Belarusian")
        const val Belarusian = "bel"
        @DisplayName("Bemba")
        const val Bemba = "bem"
        @DisplayName("Bengali")
        const val Bengali = "ben"
        @DisplayName("Berber (Other)")
        const val Berber = "ber"
        @DisplayName("Bhojpuri")
        const val Bhojpuri = "bho"
        @DisplayName("Bihari")
        const val Bihari = "bih"
        @DisplayName("Bikol")
        const val Bikol = "bik"
        @DisplayName("Bini")
        const val Bini = "bin"
        @DisplayName("Bislama")
        const val Bislama = "bis"
        @DisplayName("Blin")
        const val Blin = "byn"
        @DisplayName("Bosnian")
        const val Bosnian = "bos"
        @DisplayName("Braj")
        const val Braj = "bra"
        @DisplayName("Breton")
        const val Breton = "bre"
        @DisplayName("Buginese")
        const val Buginese = "bug"
        @DisplayName("Bulgarian")
        const val Bulgarian = "bul"
        @DisplayName("Buriat")
        const val Buriat = "bua"
        @DisplayName("Burmese")
        const val Burmese = "bur"
        @DisplayName("Caddo")
        const val Caddo = "cad"
        @DisplayName("Carib")
        const val Carib = "car"
        @DisplayName("Catalan")
        const val Catalan = "cat"
        @DisplayName("Caucasian (Other)")
        const val Caucasian = "cau"
        @DisplayName("Cebuano")
        const val Cebuano = "ceb"
        @DisplayName("Celtic (Other)")
        const val Celtic = "cel"
        @DisplayName("Central American Indian (Other)")
        const val CentralAmericanIndian = "cai"
        @DisplayName("Chagatai")
        const val Chagatai = "chg"
        @DisplayName("Chamic languages")
        const val ChamicLanguages = "cmc"
        @DisplayName("Chamorro")
        const val Chamorro = "cha"
        @DisplayName("Chechen")
        const val Chechen = "che"
        @DisplayName("Cherokee")
        const val Cherokee = "chr"
        @DisplayName("Cheyenne")
        const val Cheyenne = "chy"
        @DisplayName("Chibcha")
        const val Chibcha = "chb"
        @DisplayName("Chichewa")
        const val Chichewa = "nya"
        @DisplayName("Chinese (simplified)")
        const val ChineseSimplified = "chi"
        @DisplayName("Chinese (traditional)")
        const val ChineseTraditional = "zht"
        @DisplayName("Chinese bilingual")
        const val ChineseBilingual = "zhe"
        @DisplayName("Chinook jargon")
        const val ChinookJargon = "chn"
        @DisplayName("Chipewyan")
        const val Chipewyan = "chp"
        @DisplayName("Choctaw")
        const val Choctaw = "cho"
        @DisplayName("Church Slavic")
        const val ChurchSlavic = "chu"
        @DisplayName("Chuukese")
        const val Chuukese = "chk"
        @DisplayName("Chuvash")
        const val Chuvash = "chv"
        @DisplayName("Classical Newari")
        const val ClassicalNewari = "nwc"
        @DisplayName("Coptic")
        const val Coptic = "cop"
        @DisplayName("Cornish")
        const val Cornish = "cor"
        @DisplayName("Corsican")
        const val Corsican = "cos"
        @DisplayName("Cree")
        const val Cree = "cre"
        @DisplayName("Creek")
        const val Creek = "mus"
        @DisplayName("Creoles and pidgins (Other)")
        const val CreolesPidgins = "crp"
        @DisplayName("Creoles and pidgins, English based (Other)")
        const val CreolesPidginsEnglishBased = "cpe"
        @DisplayName("Creoles and pidgins, French-based (Other)")
        const val CreolesPidginsFrenchBased = "cpf"
        @DisplayName("Creoles and pidgins, Portuguese-based (Other)")
        const val CreolesPidginsPortuguesetoBased = "cpp"
        @DisplayName("Crimean Tatar")
        const val CrimeanTatar = "crh"
        @DisplayName("Croatian")
        const val Croatian = "hrv"
        @DisplayName("Cushitic (Other)' couchitiques, autres langues")
        const val CushiticCouchitiquesautresLanguages = "cus"
        @DisplayName("Czech")
        const val Czech = "cze"
        @DisplayName("Dakota")
        const val Dakota = "dak"
        @DisplayName("Danish")
        const val Danish = "dan"
        @DisplayName("Dargwa")
        const val Dargwa = "dar"
        @DisplayName("Dayak")
        const val Dayak = "day"
        @DisplayName("Delaware")
        const val Delaware = "del"
        @DisplayName("Dinka")
        const val Dinka = "din"
        @DisplayName("Divehi")
        const val Divehi = "div"
        @DisplayName("Dogri")
        const val Dogri = "doi"
        @DisplayName("Dogrib")
        const val Dogrib = "dgr"
        @DisplayName("Dravidian (Other)")
        const val Dravidian = "dra"
        @DisplayName("Duala")
        const val Duala = "dua"
        @DisplayName("Dutch")
        const val Dutch = "dut"
        @DisplayName("Dutch, Middle (ca.1050-1350)")
        const val DutchMiddleCa1050to1350 = "dum"
        @DisplayName("Dyula")
        const val Dyula = "dyu"
        @DisplayName("Dzongkha")
        const val Dzongkha = "dzo"
        @DisplayName("Efik")
        const val Efik = "efi"
        @DisplayName("Egyptian (Ancient)")
        const val EgyptianAncient = "egy"
        @DisplayName("Ekajuk")
        const val Ekajuk = "eka"
        @DisplayName("Elamite")
        const val Elamite = "elx"
        @DisplayName("English")
        const val English = "eng"
        @DisplayName("English, Middle (1100-1500)")
        const val EnglishMiddle1100to1500 = "enm"
        @DisplayName("English, Old (ca.450-1100)")
        const val EnglishOldCa450to1100 = "ang"
        @DisplayName("Erzya")
        const val Erzya = "myv"
        @DisplayName("Esperanto")
        const val Esperanto = "epo"
        @DisplayName("Estonian")
        const val Estonian = "est"
        @DisplayName("Ewe")
        const val Ewe = "ewe"
        @DisplayName("Ewondo")
        const val Ewondo = "ewo"
        @DisplayName("Extremaduran")
        const val Extremaduran = "ext"
        @DisplayName("Fang")
        const val Fang = "fan"
        @DisplayName("Fanti")
        const val Fanti = "fat"
        @DisplayName("Faroese")
        const val Faroese = "fao"
        @DisplayName("Fijian")
        const val Fijian = "fij"
        @DisplayName("Filipino")
        const val Filipino = "fil"
        @DisplayName("Finnish")
        const val Finnish = "fin"
        @DisplayName("Finno-Ugrian (Other)")
        const val FinnotoUgrian = "fiu"
        @DisplayName("Fon")
        const val Fon = "fon"
        @DisplayName("French")
        const val French = "fre"
        @DisplayName("French, Middle (ca.1400-1600)")
        const val FrenchMiddleCa1400to1600 = "frm"
        @DisplayName("French, Old (842-ca.1400)")
        const val FrenchOld842toCa1400 = "fro"
        @DisplayName("Frisian")
        const val Frisian = "fry"
        @DisplayName("Friulian")
        const val Friulian = "fur"
        @DisplayName("Fulah")
        const val Fulah = "ful"
        @DisplayName("Ga")
        const val Ga = "gaa"
        @DisplayName("Gaelic")
        const val Gaelic = "gla"
        @DisplayName("Galician")
        const val Galician = "glg"
        @DisplayName("Ganda")
        const val Ganda = "lug"
        @DisplayName("Gayo")
        const val Gayo = "gay"
        @DisplayName("Gbaya")
        const val Gbaya = "gba"
        @DisplayName("Geez")
        const val Geez = "gez"
        @DisplayName("Georgian")
        const val Georgian = "geo"
        @DisplayName("German")
        const val German = "ger"
        @DisplayName("German, Middle High (ca.1050-1500)")
        const val GermanMiddleHighCa1050to1500 = "gmh"
        @DisplayName("German, Old High (ca.750-1050)")
        const val GermanOldHighCa750to1050 = "goh"
        @DisplayName("Germanic (Other)")
        const val Germanic = "gem"
        @DisplayName("Gilbertese")
        const val Gilbertese = "gil"
        @DisplayName("Gondi")
        const val Gondi = "gon"
        @DisplayName("Gorontalo")
        const val Gorontalo = "gor"
        @DisplayName("Gothic")
        const val Gothic = "got"
        @DisplayName("Grebo")
        const val Grebo = "grb"
        @DisplayName("Greek")
        const val Greek = "ell"
        @DisplayName("Greek, Ancient (to 1453)")
        const val GreekAncientto1453 = "grc"
        @DisplayName("Guarani")
        const val Guarani = "grn"
        @DisplayName("Gujarati")
        const val Gujarati = "guj"
        @DisplayName("Gwich´in")
        const val Gwichin = "gwi"
        @DisplayName("Haida")
        const val Haida = "hai"
        @DisplayName("Haitian")
        const val Haitian = "hat"
        @DisplayName("Hausa")
        const val Hausa = "hau"
        @DisplayName("Hawaiian")
        const val Hawaiian = "haw"
        @DisplayName("Hebrew")
        const val Hebrew = "heb"
        @DisplayName("Herero")
        const val Herero = "her"
        @DisplayName("Hiligaynon")
        const val Hiligaynon = "hil"
        @DisplayName("Himachali")
        const val Himachali = "him"
        @DisplayName("Hindi")
        const val Hindi = "hin"
        @DisplayName("Hiri Motu")
        const val HiriMotu = "hmo"
        @DisplayName("Hittite")
        const val Hittite = "hit"
        @DisplayName("Hmong")
        const val Hmong = "hmn"
        @DisplayName("Hungarian")
        const val Hungarian = "hun"
        @DisplayName("Hupa")
        const val Hupa = "hup"
        @DisplayName("Iban")
        const val Iban = "iba"
        @DisplayName("Icelandic")
        const val Icelandic = "ice"
        @DisplayName("Ido")
        const val Ido = "ido"
        @DisplayName("Igbo")
        const val Igbo = "ibo"
        @DisplayName("Ijo")
        const val Ijo = "ijo"
        @DisplayName("Iloko")
        const val Iloko = "ilo"
        @DisplayName("Inari Sami")
        const val InariSami = "smn"
        @DisplayName("Indic (Other)")
        const val Indic = "inc"
        @DisplayName("Indo-European (Other)")
        const val IndotoEuropean = "ine"
        @DisplayName("Indonesian")
        const val Indonesian = "ind"
        @DisplayName("Ingush")
        const val Ingush = "inh"
        @DisplayName("Interlingua (International Auxiliary Entry Association)")
        const val InterlinguaInternationalAuxiliaryLanguageAssociation = "ina"
        @DisplayName("Interlingue")
        const val Interlingue = "ile"
        @DisplayName("Inuktitut")
        const val Inuktitut = "iku"
        @DisplayName("Inupiaq")
        const val Inupiaq = "ipk"
        @DisplayName("Iranian (Other)")
        const val Iranian = "ira"
        @DisplayName("Irish")
        const val Irish = "gle"
        @DisplayName("Irish, Middle (900-1200)")
        const val IrishMiddle900to1200 = "mga"
        @DisplayName("Irish, Old (to 900)")
        const val IrishOldto900 = "sga"
        @DisplayName("Iroquoian languages")
        const val IroquoianLanguages = "iro"
        @DisplayName("Italian")
        const val Italian = "ita"
        @DisplayName("Japanese")
        const val Japanese = "jpn"
        @DisplayName("Javanese")
        const val Javanese = "jav"
        @DisplayName("Judeo-Arabic")
        const val JudeotoArabic = "jrb"
        @DisplayName("Judeo-Persian")
        const val JudeotoPersian = "jpr"
        @DisplayName("Kabardian")
        const val Kabardian = "kbd"
        @DisplayName("Kabyle")
        const val Kabyle = "kab"
        @DisplayName("Kachin")
        const val Kachin = "kac"
        @DisplayName("Kalaallisut")
        const val Kalaallisut = "kal"
        @DisplayName("Kalmyk")
        const val Kalmyk = "xal"
        @DisplayName("Kamba")
        const val Kamba = "kam"
        @DisplayName("Kannada")
        const val Kannada = "kan"
        @DisplayName("Kanuri")
        const val Kanuri = "kau"
        @DisplayName("Kara-Kalpak")
        const val KaratoKalpak = "kaa"
        @DisplayName("Karachay-Balkar")
        const val KarachaytoBalkar = "krc"
        @DisplayName("Karen")
        const val Karen = "kar"
        @DisplayName("Kashmiri")
        const val Kashmiri = "kas"
        @DisplayName("Kashubian")
        const val Kashubian = "csb"
        @DisplayName("Kawi")
        const val Kawi = "kaw"
        @DisplayName("Kazakh")
        const val Kazakh = "kaz"
        @DisplayName("Khasi")
        const val Khasi = "kha"
        @DisplayName("Khmer")
        const val Khmer = "khm"
        @DisplayName("Khoisan (Other)")
        const val Khoisan = "khi"
        @DisplayName("Khotanese")
        const val Khotanese = "kho"
        @DisplayName("Kikuyu")
        const val Kikuyu = "kik"
        @DisplayName("Kimbundu")
        const val Kimbundu = "kmb"
        @DisplayName("Kinyarwanda")
        const val Kinyarwanda = "kin"
        @DisplayName("Kirghiz")
        const val Kirghiz = "kir"
        @DisplayName("Klingon")
        const val Klingon = "tlh"
        @DisplayName("Komi")
        const val Komi = "kom"
        @DisplayName("Kongo")
        const val Kongo = "kon"
        @DisplayName("Konkani")
        const val Konkani = "kok"
        @DisplayName("Korean")
        const val Korean = "kor"
        @DisplayName("Kosraean")
        const val Kosraean = "kos"
        @DisplayName("Kpelle")
        const val Kpelle = "kpe"
        @DisplayName("Kru")
        const val Kru = "kro"
        @DisplayName("Kuanyama")
        const val Kuanyama = "kua"
        @DisplayName("Kumyk")
        const val Kumyk = "kum"
        @DisplayName("Kurdish")
        const val Kurdish = "kur"
        @DisplayName("Kurukh")
        const val Kurukh = "kru"
        @DisplayName("Kutenai")
        const val Kutenai = "kut"
        @DisplayName("Ladino")
        const val Ladino = "lad"
        @DisplayName("Lahnda")
        const val Lahnda = "lah"
        @DisplayName("Lamba")
        const val Lamba = "lam"
        @DisplayName("Lao")
        const val Lao = "lao"
        @DisplayName("Latin")
        const val Latin = "lat"
        @DisplayName("Latvian")
        const val Latvian = "lav"
        @DisplayName("Lezghian")
        const val Lezghian = "lez"
        @DisplayName("Limburgan")
        const val Limburgan = "lim"
        @DisplayName("Lingala")
        const val Lingala = "lin"
        @DisplayName("Lithuanian")
        const val Lithuanian = "lit"
        @DisplayName("Low German")
        const val LowGerman = "nds"
        @DisplayName("Lozi")
        const val Lozi = "loz"
        @DisplayName("Luba-Katanga")
        const val LubatoKatanga = "lub"
        @DisplayName("Luba-Lulua")
        const val LubatoLulua = "lua"
        @DisplayName("Luiseno")
        const val Luiseno = "lui"
        @DisplayName("Lule Sami")
        const val LuleSami = "smj"
        @DisplayName("Lunda")
        const val Lunda = "lun"
        @DisplayName("Luo (Kenya and Tanzania)")
        const val LuoKenyaAndTanzania = "luo"
        @DisplayName("lushai")
        const val lushai = "lus"
        @DisplayName("Luxembourgish")
        const val Luxembourgish = "ltz"
        @DisplayName("Macedonian")
        const val Macedonian = "mac"
        @DisplayName("Madurese")
        const val Madurese = "mad"
        @DisplayName("Magahi")
        const val Magahi = "mag"
        @DisplayName("Maithili")
        const val Maithili = "mai"
        @DisplayName("Makasar")
        const val Makasar = "mak"
        @DisplayName("Malagasy")
        const val Malagasy = "mlg"
        @DisplayName("Malay")
        const val Malay = "may"
        @DisplayName("Malayalam")
        const val Malayalam = "mal"
        @DisplayName("Maltese")
        const val Maltese = "mlt"
        @DisplayName("Manchu")
        const val Manchu = "mnc"
        @DisplayName("Mandar")
        const val Mandar = "mdr"
        @DisplayName("Mandingo")
        const val Mandingo = "man"
        @DisplayName("Manipuri")
        const val Manipuri = "mni"
        @DisplayName("Manobo languages")
        const val ManoboLanguages = "mno"
        @DisplayName("Manx")
        const val Manx = "glv"
        @DisplayName("Maori")
        const val Maori = "mao"
        @DisplayName("Marathi")
        const val Marathi = "mar"
        @DisplayName("Mari")
        const val Mari = "chm"
        @DisplayName("Marshallese")
        const val Marshallese = "mah"
        @DisplayName("Marwari")
        const val Marwari = "mwr"
        @DisplayName("Masai")
        const val Masai = "mas"
        @DisplayName("Mayan languages")
        const val MayanLanguages = "myn"
        @DisplayName("Mende")
        const val Mende = "men"
        @DisplayName("Mi'kmaq")
        const val Mikmaq = "mic"
        @DisplayName("Minangkabau")
        const val Minangkabau = "min"
        @DisplayName("Mirandese")
        const val Mirandese = "mwl"
        @DisplayName("Miscellaneous languages")
        const val MiscellaneousLanguages = "mis"
        @DisplayName("Mohawk")
        const val Mohawk = "moh"
        @DisplayName("Moksha")
        const val Moksha = "mdf"
        @DisplayName("Moldavian")
        const val Moldavian = "mol"
        @DisplayName("Mon-Khmer (Other)")
        const val MontoKhmer = "mkh"
        @DisplayName("Mongo")
        const val Mongo = "lol"
        @DisplayName("Mongolian")
        const val Mongolian = "mon"
        @DisplayName("Montenegrin")
        const val Montenegrin = "mne"
        @DisplayName("Mossi")
        const val Mossi = "mos"
        @DisplayName("Multiple languages")
        const val MultipleLanguages = "mul"
        @DisplayName("Munda languages")
        const val MundaLanguages = "mun"
        @DisplayName("Nahuatl")
        const val Nahuatl = "nah"
        @DisplayName("Nauru")
        const val Nauru = "nau"
        @DisplayName("Navajo")
        const val Navajo = "nav"
        @DisplayName("Ndebele, North")
        const val NdebeleNorth = "nde"
        @DisplayName("Ndebele, South")
        const val NdebeleSouth = "nbl"
        @DisplayName("Ndonga")
        const val Ndonga = "ndo"
        @DisplayName("Neapolitan")
        const val Neapolitan = "nap"
        @DisplayName("Nepal Bhasa")
        const val NepalBhasa = "new"
        @DisplayName("Nepali")
        const val Nepali = "nep"
        @DisplayName("Nias")
        const val Nias = "nia"
        @DisplayName("Niger-Kordofanian (Other)")
        const val NigertoKordofanian = "nic"
        @DisplayName("Nilo-Saharan (Other)")
        const val NilotoSaharan = "ssa"
        @DisplayName("Niuean")
        const val Niuean = "niu"
        @DisplayName("Nogai")
        const val Nogai = "nog"
        @DisplayName("Norse, Old")
        const val NorseOld = "non"
        @DisplayName("North American Indian")
        const val NorthAmericanIndian = "nai"
        @DisplayName("Northern Sami")
        const val NorthernSami = "sme"
        @DisplayName("Northern Sotho")
        const val NorthernSotho = "nso"
        @DisplayName("Norwegian")
        const val Norwegian = "nor"
        @DisplayName("Norwegian Bokmal")
        const val NorwegianBokmal = "nob"
        @DisplayName("Norwegian Nynorsk")
        const val NorwegianNynorsk = "nno"
        @DisplayName("Nubian languages")
        const val NubianLanguages = "nub"
        @DisplayName("Nyamwezi")
        const val Nyamwezi = "nym"
        @DisplayName("Nyankole")
        const val Nyankole = "nyn"
        @DisplayName("Nyoro")
        const val Nyoro = "nyo"
        @DisplayName("Nzima")
        const val Nzima = "nzi"
        @DisplayName("Occitan")
        const val Occitan = "oci"
        @DisplayName("Ojibwa")
        const val Ojibwa = "oji"
        @DisplayName("Oriya")
        const val Oriya = "ori"
        @DisplayName("Oromo")
        const val Oromo = "orm"
        @DisplayName("Osage")
        const val Osage = "osa"
        @DisplayName("Ossetian")
        const val Ossetian = "oss"
        @DisplayName("Otomian languages")
        const val OtomianLanguages = "oto"
        @DisplayName("Pahlavi")
        const val Pahlavi = "pal"
        @DisplayName("Palauan")
        const val Palauan = "pau"
        @DisplayName("Pali")
        const val Pali = "pli"
        @DisplayName("Pampanga")
        const val Pampanga = "pam"
        @DisplayName("Pangasinan")
        const val Pangasinan = "pag"
        @DisplayName("Panjabi")
        const val Panjabi = "pan"
        @DisplayName("Papiamento")
        const val Papiamento = "pap"
        @DisplayName("Papuan (Other)")
        const val Papuan = "paa"
        @DisplayName("Persian")
        const val Persian = "per"
        @DisplayName("Persian, Old (ca.600-400 B.C.)")
        const val PersianOldCa600to400Bc = "peo"
        @DisplayName("Philippine (Other)")
        const val Philippine = "phi"
        @DisplayName("Phoenician")
        const val Phoenician = "phn"
        @DisplayName("Pohnpeian")
        const val Pohnpeian = "pon"
        @DisplayName("Polish")
        const val Polish = "pol"
        @DisplayName("Portuguese")
        const val Portuguese = "por"
        @DisplayName("Portuguese (BR)")
        const val PortugueseBr = "pob"
        @DisplayName("Portuguese (MZ)")
        const val PortugueseMz = "pom"
        @DisplayName("Prakrit languages")
        const val PrakritLanguages = "pra"
        @DisplayName("Provençal, Old (to 1500)")
        const val ProvencalOldto1500 = "pro"
        @DisplayName("Pushto")
        const val Pushto = "pus"
        @DisplayName("Quechua")
        const val Quechua = "que"
        @DisplayName("Raeto-Romance")
        const val RaetotoRomance = "roh"
        @DisplayName("Rajasthani")
        const val Rajasthani = "raj"
        @DisplayName("Rapanui")
        const val Rapanui = "rap"
        @DisplayName("Rarotongan")
        const val Rarotongan = "rar"
        @DisplayName("Romance (Other)")
        const val Romance = "roa"
        @DisplayName("Romanian")
        const val Romanian = "rum"
        @DisplayName("Romany")
        const val Romany = "rom"
        @DisplayName("Rundi")
        const val Rundi = "run"
        @DisplayName("Russian")
        const val Russian = "rus"
        @DisplayName("Salishan languages")
        const val SalishanLanguages = "sal"
        @DisplayName("Samaritan Aramaic")
        const val SamaritanAramaic = "sam"
        @DisplayName("Sami languages (Other)")
        const val SamiLanguages = "smi"
        @DisplayName("Samoan")
        const val Samoan = "smo"
        @DisplayName("Sandawe")
        const val Sandawe = "sad"
        @DisplayName("Sango")
        const val Sango = "sag"
        @DisplayName("Sanskrit")
        const val Sanskrit = "san"
        @DisplayName("Santali")
        const val Santali = "sat"
        @DisplayName("Sardinian")
        const val Sardinian = "srd"
        @DisplayName("Sasak")
        const val Sasak = "sas"
        @DisplayName("Scots")
        const val Scots = "sco"
        @DisplayName("Selkup")
        const val Selkup = "sel"
        @DisplayName("Semitic (Other)")
        const val Semitic = "sem"
        @DisplayName("Serbian")
        const val Serbian = "scc"
        @DisplayName("Serer")
        const val Serer = "srr"
        @DisplayName("Shan")
        const val Shan = "shn"
        @DisplayName("Shona")
        const val Shona = "sna"
        @DisplayName("Sichuan Yi")
        const val SichuanYi = "iii"
        @DisplayName("Sicilian")
        const val Sicilian = "scn"
        @DisplayName("Sidamo")
        const val Sidamo = "sid"
        @DisplayName("Sign Languages")
        const val SignLanguages = "sgn"
        @DisplayName("Siksika")
        const val Siksika = "bla"
        @DisplayName("Sindhi")
        const val Sindhi = "snd"
        @DisplayName("Sinhalese")
        const val Sinhalese = "sin"
        @DisplayName("Sino-Tibetan (Other)")
        const val SinotoTibetan = "sit"
        @DisplayName("Siouan languages")
        const val SiouanLanguages = "sio"
        @DisplayName("Skolt Sami")
        const val SkoltSami = "sms"
        @DisplayName("Slave (Athapascan)")
        const val SlaveAthapascan = "den"
        @DisplayName("Slavic (Other)")
        const val Slavic = "sla"
        @DisplayName("Slovak")
        const val Slovak = "slo"
        @DisplayName("Slovenian")
        const val Slovenian = "slv"
        @DisplayName("Sogdian")
        const val Sogdian = "sog"
        @DisplayName("Somali")
        const val Somali = "som"
        @DisplayName("Songhai")
        const val Songhai = "son"
        @DisplayName("Soninke")
        const val Soninke = "snk"
        @DisplayName("Sorbian languages")
        const val SorbianLanguages = "wen"
        @DisplayName("Sotho, Southern")
        const val SothoSouthern = "sot"
        @DisplayName("South American Indian (Other)")
        const val SouthAmericanIndian = "sai"
        @DisplayName("Southern Altai")
        const val SouthernAltai = "alt"
        @DisplayName("Southern Sami")
        const val SouthernSami = "sma"
        @DisplayName("Spanish")
        const val Spanish = "spa"
        @DisplayName("Sukuma")
        const val Sukuma = "suk"
        @DisplayName("Sumerian")
        const val Sumerian = "sux"
        @DisplayName("Sundanese")
        const val Sundanese = "sun"
        @DisplayName("Susu")
        const val Susu = "sus"
        @DisplayName("Swahili")
        const val Swahili = "swa"
        @DisplayName("Swati")
        const val Swati = "ssw"
        @DisplayName("Swedish")
        const val Swedish = "swe"
        @DisplayName("Syriac")
        const val Syriac = "syr"
        @DisplayName("Tagalog")
        const val Tagalog = "tgl"
        @DisplayName("Tahitian")
        const val Tahitian = "tah"
        @DisplayName("Tai (Other)")
        const val Tai = "tai"
        @DisplayName("Tajik")
        const val Tajik = "tgk"
        @DisplayName("Tamashek")
        const val Tamashek = "tmh"
        @DisplayName("Tamil")
        const val Tamil = "tam"
        @DisplayName("Tatar")
        const val Tatar = "tat"
        @DisplayName("Telugu")
        const val Telugu = "tel"
        @DisplayName("Tereno")
        const val Tereno = "ter"
        @DisplayName("Tetum")
        const val Tetum = "tet"
        @DisplayName("Thai")
        const val Thai = "tha"
        @DisplayName("Tibetan")
        const val Tibetan = "tib"
        @DisplayName("Tigre")
        const val Tigre = "tig"
        @DisplayName("Tigrinya")
        const val Tigrinya = "tir"
        @DisplayName("Timne")
        const val Timne = "tem"
        @DisplayName("Tiv")
        const val Tiv = "tiv"
        @DisplayName("Tlingit")
        const val Tlingit = "tli"
        @DisplayName("Tok Pisin")
        const val TokPisin = "tpi"
        @DisplayName("Tokelau")
        const val Tokelau = "tkl"
        @DisplayName("Tonga (Nyasa)")
        const val TongaNyasa = "tog"
        @DisplayName("Tonga (Tonga Islands)")
        const val TongaTongaIslands = "ton"
        @DisplayName("Tsimshian")
        const val Tsimshian = "tsi"
        @DisplayName("Tsonga")
        const val Tsonga = "tso"
        @DisplayName("Tswana")
        const val Tswana = "tsn"
        @DisplayName("Tumbuka")
        const val Tumbuka = "tum"
        @DisplayName("Tupi languages")
        const val TupiLanguages = "tup"
        @DisplayName("Turkish")
        const val Turkish = "tur"
        @DisplayName("Turkish, Ottoman (1500-1928)")
        const val TurkishOttoman1500to1928 = "ota"
        @DisplayName("Turkmen")
        const val Turkmen = "tuk"
        @DisplayName("Tuvalu")
        const val Tuvalu = "tvl"
        @DisplayName("Tuvinian")
        const val Tuvinian = "tyv"
        @DisplayName("Twi")
        const val Twi = "twi"
        @DisplayName("Udmurt")
        const val Udmurt = "udm"
        @DisplayName("Ugaritic")
        const val Ugaritic = "uga"
        @DisplayName("Uighur")
        const val Uighur = "uig"
        @DisplayName("Ukrainian")
        const val Ukrainian = "ukr"
        @DisplayName("Umbundu")
        const val Umbundu = "umb"
        @DisplayName("Undetermined")
        const val Undetermined = "und"
        @DisplayName("Urdu")
        const val Urdu = "urd"
        @DisplayName("Uzbek")
        const val Uzbek = "uzb"
        @DisplayName("Vai")
        const val Vai = "vai"
        @DisplayName("Venda")
        const val Venda = "ven"
        @DisplayName("Vietnamese")
        const val Vietnamese = "vie"
        @DisplayName("Volapük")
        const val Volapuk = "vol"
        @DisplayName("Votic")
        const val Votic = "vot"
        @DisplayName("Wakashan languages")
        const val WakashanLanguages = "wak"
        @DisplayName("Walamo")
        const val Walamo = "wal"
        @DisplayName("Walloon")
        const val Walloon = "wln"
        @DisplayName("Waray")
        const val Waray = "war"
        @DisplayName("Washo")
        const val Washo = "was"
        @DisplayName("Welsh")
        const val Welsh = "wel"
        @DisplayName("Wolof")
        const val Wolof = "wol"
        @DisplayName("Xhosa")
        const val Xhosa = "xho"
        @DisplayName("Yakut")
        const val Yakut = "sah"
        @DisplayName("Yao")
        const val Yao = "yao"
        @DisplayName("Yapese")
        const val Yapese = "yap"
        @DisplayName("Yiddish")
        const val Yiddish = "yid"
        @DisplayName("Yoruba")
        const val Yoruba = "yor"
        @DisplayName("Yupik languages")
        const val YupikLanguages = "ypk"
        @DisplayName("Zande")
        const val Zande = "znd"
        @DisplayName("Zapotec")
        const val Zapotec = "zap"
        @DisplayName("Zenaga")
        const val Zenaga = "zen"
        @DisplayName("Zhuang")
        const val Zhuang = "zha"
        @DisplayName("Zulu")
        const val Zulu = "zul"
        @DisplayName("Zuni")
        const val Zuni = "zun"


    }
}
